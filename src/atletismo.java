import java.util.Scanner;

public class atletismo {
    public static void main(String[] args) throws Exception {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Entre com o tempo do primeiro atleta: ");
        int tempo1 = myScanner.nextInt();

        System.out.println("Entre com o tempo do Segundo atleta: ");
        int tempo2 = myScanner.nextInt();

        System.out.println("Entre com o tempo do Terceiro atleta: ");
        int tempo3 = myScanner.nextInt();

        if (tempo1 > tempo2 && tempo1 > tempo3) {
            System.out.println("Primeiro foi vencedor");
        } else if (tempo1 < tempo2 && tempo2 > tempo3) {
            System.out.println("Segundo foi vencedor");
        }

    }
}
