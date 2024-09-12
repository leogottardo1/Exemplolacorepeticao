import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] nomesJogadores = new String[10];
        Scanner sc = new Scanner(System.in);


        //inicialização; condição; impremento
        //++ -> vai somar + 1
        //for (int i = 0; i < 10; i++) {
            //System.out.println("Informe o nome do player " + i);
            //nomesJogadores[i] = sc.next();


        //Pedir o nome do time A
        //Pedir os nomes do time A (5 nomes)
        //Pedir o nome do Time B
        //Pedir os nomes do time B (5 nomes)

        System.out.println("informe o time A");
        String nomeTime = sc.next();

        String[] nomeSplayerStimeA = new String[5];

        for (int i = 1; i <= 5; i++) {
            System.out.println("Informe o nome do player " + i);
            nomeSplayerStimeA[i-1] = sc.next();

        }
    }
}