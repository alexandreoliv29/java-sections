import java.util.Scanner;

public class imc {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Pessoa("", 0, 0, 0);
    }

    public static void Pessoa(String nome, int idade, double altura, double peso) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Escreva o nome da pessoa: ");
        nome = myScanner.nextLine();
        System.out.println("Escreva a idade da pessoa: ");
        idade = myScanner.nextInt();
        System.out.println("Escreva a altura da pessoa: ");
        altura = myScanner.nextDouble();
        System.out.println("Escreva o peso da pessoa: ");
        peso = myScanner.nextDouble();

        double imc = calculaIMC(altura, peso);
        imprimaDados(nome, imc);
    }
    public static double calculaIMC(double altura, double peso){
        return peso / (altura * altura);
    }
    public static void imprimaDados( String nome, double imc){
        System.out.println("o IMC de " + nome + " é: " + imc);
    }
}
