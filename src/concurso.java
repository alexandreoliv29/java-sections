import java.util.Scanner;

public class concurso {
    public static void main(String[] args) throws Exception {

        // mostrar o salário de acordo com o cargo informado
        Scanner myObj = new Scanner(System.in);

        System.out.println("Digite o cargo para saber o salário: ");
        String cargo = myObj.nextLine();

        switch (cargo) {
            case "Ensino Infantil":
                System.out.println("4000");
            case "Ensino Infantil 2":
                System.out.println("5000");
            case "Ensino Fundamental 1":
                System.out.println("6000");
            case "Ensino Fundamental 2":
                System.out.println("7000");
            case "Ensino Medio":
                System.out.println("8000");
            default:
                break;
        }
    }
}