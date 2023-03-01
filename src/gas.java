import java.util.Scanner;

public class gas {
    public static void main(String[] args) throws Exception {
       /*  Scanner myObj = new Scanner(System.in);
        System.out.println("Qual o valor do litro da gasolina ?");
        float valorLitro = myObj.nextFloat();
        System.out.println("Qual a quantidade de litros que o cliente vai abastecer ?");
        float quantidadeLitros = myObj.nextFloat();
        float resultado = valorLitro * quantidadeLitros;
        System.out.println("O preço do abastecimento é: " + resultado);
        */

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Qual o valor do litro da gasolina ?");
        float valorLitro = myScanner.nextFloat();
        System.out.println("Qual a quantidade de litros que o cliente vai abastecer ?");
        float quantidadeLitros = myScanner.nextFloat();
        float resultado = valorLitro * quantidadeLitros;
        System.out.println("O valor Total: " + resultado);


        

    }
}
