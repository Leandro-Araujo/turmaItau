package exercicios.exercicio2;

public abstract class Pessoa { // abstract = classe abstrata, não pode gerar objetos
    private String nome, telefone;

    public Pessoa(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return nome + ", " + telefone;
    }

}
