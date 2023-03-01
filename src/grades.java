import java.util.Scanner;

public class grades {
    public static void main(String[] args) throws Exception {
        /*
         * Scanner myScanner = new Scanner(System.in);
         * System.out.println("Enter grades for each quarter: ");
         * float grade1 = myScanner.nextFloat();
         * float grade2 = myScanner.nextFloat();
         * float grade3 = myScanner.nextFloat();
         * float grade4 = myScanner.nextFloat();
         * 
         * float gradeYearly = (grade1 + grade2 + grade3 + grade4)/4;
         * 
         * System.out.println("The Yearly average is:  " + gradeYearly);
         * 
         * if (gradeYearly >= 7 ) {
         * System.out.println("Aprovado");
         * } else if(gradeYearly < 7 && gradeYearly >= 5) {
         * System.out.println("Recuperação");
         * }else {
         * System.out.println("Reprovado");
         * }
         */

        System.out.println("Enter grades for each quarter: ");

        Scanner myScanner = new Scanner(System.in);

        double sumGrades = 0;

        for (int i = 0; i < 4; i++) {
            float grade = myScanner.nextFloat();
            sumGrades += grade;
        }

        double gradeYearly = (sumGrades / 4);

        System.out.println("The gradeYearly is: " + gradeYearly);

        
    }
}
