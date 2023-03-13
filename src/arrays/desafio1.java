package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class desafio1 {
    public static void main(String [] args){
        List<Double> notas = new ArrayList<>(Arrays.asList(7.9, 9.0, 9.2, 6.0, 5.3));
        exibeResultado(notas);

    }

    public static void exibeResultado(List<Double> listaNotas) {
        int numAprovados = 0;
        int numReprovados = 0;

        for(int i = 0; i < listaNotas.size(); i++){
            if(listaNotas.get(i) >= 7){
                numAprovados +=1;
            } else {
                numReprovados += 1;
            }
        }
        System.out.println("Numero Aprovados: " + numAprovados + " Numero Reprovados: " + numReprovados);
    } 
}
