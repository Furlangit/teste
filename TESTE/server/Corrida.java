package server;

import java.io.PrintStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Corrida extends Thread {
    Socket clienteSocket;
    ArrayList<String> cavalosapostados = new ArrayList<>();
    List<Cavalo> cavalos = new ArrayList<>();
    //cavalos.add(new Cavalo("Algum"));
    Cavalo c1 = new Cavalo("caramelo"); 

    public Corrida(Socket socket) {
        clienteSocket = socket;
        corridaCavalo();
    }

    private List corridaCavalo() {
        /*
         * cavalos.add("Cavalo 1");
         * cavalos.add("Cavalo 2");
         * cavalos.add("Cavalo 3");
         * cavalos.add("Cavalo 4");
         * cavalos.add("Cavalo 5");
         */
        return null;
    }

    @Override
    public void run() {
        try {
            Scanner scanner = new Scanner(clienteSocket.getInputStream());
            String resultado = scanner.nextLine();

            // Um for com if dentro (for pegando os valores do resultado de uma corrida) e o
            // if para saber se a aposta foi vitoriosa

            PrintStream printStream = new PrintStream(clienteSocket.getOutputStream());
            printStream.println(resultado);

        } catch (Exception e) {
            System.out.println("Erro na thread: " + e.getMessage());
        }
    }

}
