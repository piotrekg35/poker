package pl.edu.agh.kis.pz1.klient;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public Client(String adress, int port) throws IOException {
        try (Socket s = new Socket(adress, port)) {
            Scanner scn = new Scanner(System.in);
            DataInputStream dis = new DataInputStream(s.getInputStream());
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());

            while (true) {
                System.out.println(dis.readUTF());
                System.out.println(dis.readUTF());
                String tosend = scn.nextLine();//wysyla do serwera
                dos.writeUTF(tosend);

                // If client sends exit,close this connection
                // and then break from the while loop
                if (tosend.equals("Q")) {
                    System.out.println("You are quitting the game...");
                    s.close();
                    System.out.println("You have quitted!");
                    break;
                }
                System.out.println(dis.readUTF());
                System.out.println(dis.readUTF());
                //betting
                betting(scn,dis,dos);
                String ss1 = "";
                ss1 = dis.readUTF();
                if (ss1.equals("OK")) {
                    //changing cards
                    System.out.println(dis.readUTF());
                    int numberOfCards = scn.nextInt();
                    dos.writeInt(numberOfCards);
                    if (numberOfCards > 0 && numberOfCards < 5) {
                        System.out.println(dis.readUTF());
                        int n;
                        for (int i = 0; i < numberOfCards; i++) {
                            n = scn.nextInt();
                            dos.writeInt(n);
                        }
                    }
                    scn.nextLine();
                    System.out.println(dis.readUTF());//wypisuje karty
                    //betting #2
                    betting(scn,dis,dos);
                }
                //end
                System.out.println(dis.readUTF());

            }
            // closing resources
            scn.close();
            dis.close();
            dos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void betting(Scanner scn,DataInputStream dis,DataOutputStream dos) throws IOException {
        while (true) {
            System.out.println(dis.readUTF());//wypisuje commands
            String s1 = scn.nextLine();
            dos.writeUTF(s1);
            if (s1.equals("P")) {
                System.out.println(dis.readUTF());
            } else if (s1.equals("B")) {
                System.out.println(dis.readUTF());
                int b = scn.nextInt();
                dos.writeInt(b);
                scn.nextLine();
                System.out.println(dis.readUTF());
            } else {
                System.out.println(dis.readUTF());
            }
            String ss = "";
            ss = dis.readUTF();
            if (ss.equals("OK")) break;

        }
    }
}
