package server;

import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
    public static void main(String[] args) {
        ServerSocket serverSocket;
        final int PORTA = 1234;
        try {
            serverSocket = new ServerSocket(PORTA);

            while(true){
                System.out.println("Aguardando o cliente ...");
                Socket socket = serverSocket.accept();
            
            Corrida corrida = new Corrida(socket);
            corrida.start();    
            }

        } catch (Exception e) {
           System.out.println("Erro no Serividor: " + e.getMessage());
        }
    }
}
