package exemplos.exemplo3;

public class Pessoa {
    // atributos - característica da pessoa
    String nome;
    int idade;

    // métodos - ação da pessoa

    //método construtor (mesmo nome da classe)
    Pessoa(String n, int i) {
        nome = n;
        idade = i;
    }

    void apresentar() {
        System.out.println("Olá! Eu sou " + nome);
        System.out.println("Tenho " + idade + " anos.");
    }

}
