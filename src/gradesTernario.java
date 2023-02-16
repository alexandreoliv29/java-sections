import java.util.Scanner;

public class gradesTernario {
    public static void main (String []args) throws Exception{
        // calcular a nota anual de cada aluno
        // notas são passadas por BIMESTRE
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter grades for each quarter: ");
        float grade1 = myObj.nextFloat();
        float grade2 = myObj.nextFloat();
        float grade3 = myObj.nextFloat();
        float grade4 = myObj.nextFloat();

        float gradeYearly = (grade1 + grade2 + grade3 + grade4)/4;

        System.out.println("The Yearly average is:  " + gradeYearly);

        System.out.println(gradeYearly >= 7 ? "O aluno está aprovado" : "O aluno está reprovado");
}}
