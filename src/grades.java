import java.util.Scanner;

public class grades {
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

        if (gradeYearly >= 7 ) {
            System.out.println("Aprovado"); 
        } else if(gradeYearly < 7 && gradeYearly >= 5) {
            System.out.println("Recuperação");
        }else {
            System.out.println("Reprovado");
        }
    }
}
