package funções;

import java.util.Scanner;

public class suspeitos {
    public static void main(String[] args) throws Exception {
       int numSim = interrogatorio();
       classificaInterrogado(numSim);
    }
    public static void classificaInterrogado(int numSim) {
        int classificacao = numSim;

        if (classificacao == 5) {
            System.out.println("Assasino");
        } else if (classificacao > 3 && classificacao < 5) {
            System.out.println("Cumplice");
        } else if (classificacao < 3 && classificacao > 1) {
            System.out.println("Suspeito");
        } else {
            System.out.println("Inocente");
        }
    }

    public static int interrogatorio() {
        Scanner myScanner = new Scanner(System.in);

        int numSim = 0;

        System.out.println("Telefonou para a vítima?");
        int resposta1 = myScanner.nextInt();
        if (resposta1 == 1) {
            numSim += 1;
        }
        System.out.println("Esteve no local do crime?");
        int resposta2 = myScanner.nextInt();
        if (resposta2 == 1) {
            numSim += 1;
        }
        System.out.println("Mora perto da vítima?");
        int resposta3 = myScanner.nextInt();
        if (resposta3 == 1) {
            numSim += 1;
        }
        System.out.println("Devia para a vítima?");
        int resposta4 = myScanner.nextInt();
        if (resposta4 == 1) {
            numSim += 1;
        }
        System.out.println("Já trabalhou para a vítima?");
        int resposta5 = myScanner.nextInt();
        if (resposta5 == 1) {
            numSim += 1;
        }

        return numSim;

    }

}
