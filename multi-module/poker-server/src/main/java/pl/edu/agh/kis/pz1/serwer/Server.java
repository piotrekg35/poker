package pl.edu.agh.kis.pz1.serwer;


import pl.edu.agh.kis.pz1.model.Game;
import pl.edu.agh.kis.pz1.model.Player;
import pl.edu.agh.kis.pz1.model.PlayerStatus;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import java.io.*;

public class Server
{
    private static final String OK = "OK";
    private static final String NOT_OK = "NOT_OK";
    public Server (int port,String a) throws IOException {
        try (ServerSocket ss = new ServerSocket(port)) {
            Game g = new Game();
            ArrayList<ClientHandler> ClList = new ArrayList<>();
            int num = 2;
            try {
                num = Integer.parseInt(a);
            } catch (NumberFormatException nfe) {
                System.out.println("The first argument must be an integer.");
                System.exit(1);
            }
            int i = 0;
            while (i < num) {
                Socket s = null;
                i++;

                try {
                    s = ss.accept();
                    System.out.println("A new client is connected : " + s);
                    DataInputStream dis = new DataInputStream(s.getInputStream());
                    DataOutputStream dos = new DataOutputStream(s.getOutputStream());
                    Player p = new Player();
                    Game.addNewPlayer(p);
                    ClientHandler clientHandler = new ClientHandler(s, dis, dos, p);
                    ClList.add(clientHandler);

                } catch (Exception e) {
                    assert s != null;
                    s.close();
                    e.printStackTrace();
                }

            }
            while (true) {
                for (ClientHandler c : ClList) c.run();
                if (Game.players.size() == 0) break;
                for (ClientHandler c : ClList) c.info();

                betting(ClList);
                Game.bettingSum = 0;
                for (ClientHandler c : ClList) c.p.setBet(0);
                int playersInGame = 0;
                for (ClientHandler c : ClList) if (c.p.getPs() != PlayerStatus.PASS) playersInGame++;
                if (playersInGame > 1) {
                    for (ClientHandler c : ClList) c.sendText(OK);
                    for (ClientHandler c : ClList) c.changingCards();
                    betting(ClList);
                    Game.bettingSum = 0;
                    for (ClientHandler c : ClList) c.p.setBet(0);
                } else for (ClientHandler c : ClList) c.sendText(NOT_OK);
                Player winner = Game.findWinner();
                for (ClientHandler c : ClList) c.ending(winner);
                Game.end();
            }
            for (ClientHandler c : ClList) c.closeConnection();
        }
    }
    private void betting(ArrayList<ClientHandler> ClList) throws IOException {
        while (true) {
            boolean flag = true;
            for (ClientHandler c : ClList) {
                if (c.p.getPs() == PlayerStatus.PASS) continue;
                c.betting();
            }
            for (ClientHandler c : ClList) {
                if (!c.p.hasPlayerBet() && c.p.getPs() != PlayerStatus.PASS) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                for (ClientHandler c : ClList) c.sendText(OK);
                break;
            } else for (ClientHandler c : ClList) c.sendText(NOT_OK);
        }
    }
}


