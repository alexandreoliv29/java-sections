package funções;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sistemaEscolar {
    public static void main(String[] args) throws Exception {

        String nome = "Manuel";
        String sobrenome = "Neto";
        int idade = 26;

        List<String> responsaveisAlunos = new ArrayList<>(Arrays.asList("Jose", "Maria"));

        responsaveisAlunos = adicionaResponsavel(responsaveisAlunos, "carolzinha");

        responsaveisAlunos = adicionaResponsavel(responsaveisAlunos, "alezin");

        responsaveisAlunos = editarResponsavel(responsaveisAlunos, "aleboy", 1);

        System.out.println(Arrays.toString(responsaveisAlunos.toArray()));

        exibeResponsaveis(responsaveisAlunos);

    }

   

    public static void exibeResponsaveis(List<String> responsaveisAlunos) {
        for (int i = 0; i <= responsaveisAlunos.size(); i++) {
            System.out.println((i + 1) + ")" + responsaveisAlunos.get(i));
        }
    }

    public static List<String> adicionaResponsavel(List<String> responsaveisAlunos, String nomeResponsavel) {
        responsaveisAlunos.add(nomeResponsavel);
        return responsaveisAlunos;
    }

    public static List<String> editarResponsavel(List<String> responsaveisAlunos, String nomeResponsavel, int index) {
        responsaveisAlunos.set(index, nomeResponsavel);
        return responsaveisAlunos;
    }

    public static String informaResultado(double media) {
        return (media >= 7 ? "O aluno está aprovado na disciplina com média " + media
                : "O aluno está reprovado na disciplina de Matemática com média " + media);
    }

    public static double calcularMedia(double somatorioNotas, int numeroNotas) {
        double media = somatorioNotas / numeroNotas;
        return media;
    }

    public static void entradaUsuario() {
        Scanner myScanner = new Scanner(System.in);

        double somadorNotas = 0;
        int somadorNumeroNotas = 0;

        while (true) {
            System.out.println("Insira uma nota: ");
            double nota = myScanner.nextDouble();
            if (nota == 0) {
                break;
            }
            somadorNotas += nota;
            somadorNumeroNotas += 1;
        }
        double media = calcularMedia(somadorNotas, somadorNumeroNotas);
        System.out.println(informaResultado(media));
    }
}
