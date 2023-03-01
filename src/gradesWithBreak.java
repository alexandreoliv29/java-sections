import java.util.Scanner;

import javax.sound.midi.Synthesizer;

public class gradesWithBreak {
    public static void main(String[] args) throws Exception {
        Scanner myScanner = new Scanner(System.in);

        double counterGrades = 0;
        int sumGrades = 0;

        while (true) {
            System.out.println("Type with grades: ");
            double grade = myScanner.nextDouble();
            
            if (grade == 0) {
                break;
            }
            counterGrades += grade;
            sumGrades += 1;
        }

    }
}
