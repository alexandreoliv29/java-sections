import java.util.Scanner;

public class login {
    public static void main (String [] args) throws Exception {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Nome: ");
        String nome = myScanner.nextLine();

        System.out.println("Sobrenome: ");
        String sobrenome = myScanner.nextLine();

        System.out.println("Email: ");
        String email = myScanner.nextLine();

        System.out.println("Digite sua senha: ");
        String senha = myScanner.nextLine();
        
        System.out.println("Confirme sua senha: ");
        String confirmaSenha = myScanner.nextLine();

        if (senha == confirmaSenha) {
            System.out.println("login efetuado com sucesso!");
        } else {
            System.out.println("Senha incorreta");
        }


    }
}
