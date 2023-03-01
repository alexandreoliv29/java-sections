import java.util.Scanner;

public class gasRepetion {
    public static void main(String[] args) throws Exception {
        /*
         * Scanner myObj = new Scanner(System.in);
         * System.out.println("Qual o valor do litro da gasolina ?");
         * float valorLitro = myObj.nextFloat();
         * System.out.
         * println("Qual a quantidade de litros que o cliente vai abastecer ?");
         * float quantidadeLitros = myObj.nextFloat();
         * float resultado = valorLitro * quantidadeLitros;
         * System.out.println("O preço do abastecimento é: " + resultado);
         */

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Qual o valor do litro da gasolina ?");
        double valorLitro = myScanner.nextFloat();
        double valorTotal = 0;


        for (int i = 1; i <= 50; i++) {
            valorTotal = valorLitro * i;
            System.out.println("Numero de litros: " + i + ". Valor do litro: " + valorLitro + ". Valor total: " + valorTotal);
        }


    }
}
