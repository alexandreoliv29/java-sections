package arrays;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class calcados {
    public static void main(String[] args) {

        System.out.println("Entre com o tamanho do array: ");
        Scanner myScanner = new Scanner(System.in);

        int size = myScanner.nextInt();

        int Horas[] = new int [size];

        int soma = 0;

        System.out.println("Entre com as horas: ");

        for(int i = 0; i < Horas.length; i++){
            Horas[i] = myScanner.nextInt();
            soma += Horas[i];
        }

        System.out.println("A soma de horas do funcionário é: " + soma);

        if(soma > 160) {
            System.out.println("Tem que receber hora extra");
        }else if(soma == 160){
            System.out.println("Receber salário normal");
        }else{
            System.out.println("Deve repor as horas");
            System.out.println("Horas a serem repostas: " + (160 - soma));
        }
    }
}
