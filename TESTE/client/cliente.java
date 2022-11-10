package client;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class cliente {
    public static void main(String[] args) {
        Socket socket;
        final int PORTA = 1234;
        final String IP = "127.0.0.1";
        PrintStream out;
        Scanner in;
        Scanner teclado;

        try {
            socket = new Socket(IP, PORTA);

            out = new PrintStream(socket.getOutputStream());
            in = new Scanner(socket.getInputStream());
            teclado = new Scanner(System.in);
            // enviando o cavalo que foi feita a aposta
            System.out.print("Em qual cavalo vai apostar: ");
            String aposta = teclado.nextLine();

            out.println(aposta);

            // recebe o resultado da corrida
            String resultado = in.nextLine();

            System.out.println("Resultado da corrida: " + resultado + " Venceu !");

        } catch (Exception e) {
            System.out.println("Erro no cliente: " + e.getMessage());
        }
    }
}
