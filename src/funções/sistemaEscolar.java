package funções;

import java.util.Scanner;

public class sistemaEscolar {
    public static void main(String[] args) throws Exception {

        String nome = "Manuel"; String sobrenome = "Neto"; int idade = 26;

        entradaUsuario();

    }

    public static String informaResultado(double media) {
        return (media >= 7 ? "O aluno está aprovado na disciplina com média " + media
                : "O aluno está reprovado na disciplina de Matemática com média " + media);
    }

    public static double calcularMedia(double somatorioNotas, int numeroNotas) {
        double media = somatorioNotas / numeroNotas;
        return media;
    }

    public static void entradaUsuario(){
        Scanner myScanner = new Scanner(System.in);

        double somadorNotas = 0;
        int somadorNumeroNotas = 0;

        while(true){
            System.out.println("Insira uma nota: ");
            double nota = myScanner.nextDouble();
            if(nota == 0) {
                break;
            }
            somadorNotas += nota;
            somadorNumeroNotas += 1;
        }   
        double media = calcularMedia(somadorNotas, somadorNumeroNotas);
        System.out.println(informaResultado(media));
    }
}
