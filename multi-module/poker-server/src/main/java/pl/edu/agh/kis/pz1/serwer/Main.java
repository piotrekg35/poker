package pl.edu.agh.kis.pz1.serwer;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Server server =new Server(5000,args[0]);
    }
}
