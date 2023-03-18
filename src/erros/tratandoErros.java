package erros;

public class tratandoErros {
    public static void main(String[] args) {
        try {
            informaResultado();
        } catch (NullPointerException e) {
            System.out
                    .println("Ocorreu um NullPointerException ao executar o método informaResultado " + e.getMessage());
        } finally {
            System.out.println("Fim da execução try-catch");
        }
    }

    public static void informaResultado()throws NullPointerException {
        String nome = "Manuel";
        double media = (Double) null;
        
        
        if (media >= 7) {
            System.out.println("O aluno " + nome + " foi aprovado");
        } else {
            System.out.println("O aluno " + nome + "foi reprovado");
        }
    }

}
