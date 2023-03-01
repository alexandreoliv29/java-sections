import java.io.Console;
import java.util.Scanner;

public class temp {
    public static void main(String[] args) throws Exception {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Escreva a temperatura: ");
        double temperatura = myScanner.nextDouble();
        double soma = temperatura;
        int i = 1;

        while (temperatura != 0) {
            System.out.println("Escreva a temperatura: ");
            temperatura = myScanner.nextDouble();
            soma += temperatura;
            i += 1;
        }
        System.out.println("i = " + i);
        System.out.println("soma = " + soma);

        double media = (soma / i);
        System.out.println("A média das temperaturas é: " + media);

    }
}
