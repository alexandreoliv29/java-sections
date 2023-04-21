package POO;

public class Pessoa {

    String nome;
    String sobrenome;
    int idade;

    Pessoa(String nome, String sobrenome, int idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
    }

    public String saudacao() {
        return String.format("Olá meu nome é %s %s", this.nome, this.sobrenome);
    }

    public int minhaIdade() {
        return String.format("Tenho %d anos de idade", this.idade);

    }
}
