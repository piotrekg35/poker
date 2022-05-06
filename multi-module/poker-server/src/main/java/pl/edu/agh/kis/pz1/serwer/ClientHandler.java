package pl.edu.agh.kis.pz1.serwer;

import pl.edu.agh.kis.pz1.model.*;

import java.io.*;
import java.net.Socket;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

class ClientHandler
{
    final DataInputStream dis;
    final DataOutputStream dos;
    final Socket s;
    Player p;

    public ClientHandler(Socket s, DataInputStream dis, DataOutputStream dos, Player p) {
        this.s = s;
        this.dis = dis;
        this.dos = dos;
        this.p=p;

    }

    public void run(Game g)
    {
        String received;
        try {
            dos.writeUTF("Welcome Player #"+p.getId()+"\nAnte is 100\n"+p.info());
            dos.writeUTF("Commands:\n" +"Q-Quit\n"+"J-Join\n");
            received = dis.readUTF();

            if(received.equals("Q"))
            {
                System.out.println("Client " + this.s + " sends exit...");
                System.out.println("Closing this connection.");
                this.s.close();
                System.out.println("Connection closed");
                Game.players.remove(p);
            }
            else if (received.equals("J")) {
                p.setPs(PlayerStatus.READY);
                dos.writeUTF("You joined the game!\n100 has been taken from  you!\n");
                p.joinGame(g);
            }
            else {dos.writeUTF("Invalid input");}

            } catch (IOException e) {
                e.printStackTrace();
            }
    }
    public void info(Game g) throws IOException {
        dos.writeUTF("Prize: "+g.prize+"\n"+p.info());
    }
    public void sendText(String s) throws IOException {
        dos.writeUTF(s);
    }
    public void changingCards(Game g) throws IOException {
        int numberOfCards;
        dos.writeUTF("How many cards do you want to change? Choose numbers from 0 to 5.");
        numberOfCards = dis.readInt();
        if(numberOfCards==5){p.clearCards();p.drawCards(g.cards,5);}
        else if(numberOfCards>0&&numberOfCards<5){
            dos.writeUTF("Which cards do you want to change? Choose numbers from 1 to 5.");
            ArrayList<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < numberOfCards; i++) {
                numbers.add(dis.readInt());
            }
            p.changeCards(numberOfCards, numbers, g.cards);
        }
        dos.writeUTF(p.info());
    }
    public void betting(Game g) throws IOException {
        String received1;
        dos.writeUTF("Betting starts. Betting: "+g.bettingSum +"\nCommands:\nB-Bet\n"+"P-Pass\n");
        received1 = dis.readUTF();
        if(received1.equals("B"))
        {
            dos.writeUTF("How much would you like to bet?");
            int bet=dis.readInt();
            if(bet+p.getBet()>=g.bettingSum) {
                p.withdrawMoney(bet);
                p.setBet(p.getBet() + bet);
                dos.writeUTF("You bet: " + bet);
                g.bettingSum=p.getBet();
                g.prize+=bet;
            }
        }
        else if (received1.equals("P")) {
            p.pass();
            dos.writeUTF("You passed");
        }
        else dos.writeUTF("Invalid input1");
    }
    public void ending(Player winner,Game g) throws IOException {
        if(p.getId()==winner.getId()){
            dos.writeUTF("\nYOU WON!\nYOUR MONEY: "+(p.getMoney()+g.prize)+"\n");
            p.sendPrize(g);
        }
        else dos.writeUTF("\nYOU LOST!\nYOUR MONEY: "+p.getMoney()+"\n");
        p.clearCards();
    }
    public void closeConnection(){
        try
        {
            this.dis.close();
            this.dos.close();

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
