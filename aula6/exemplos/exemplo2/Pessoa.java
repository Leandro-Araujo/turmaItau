package exemplos.exemplo2;

public class Pessoa {
    private String nome;
    private int codigo;

    public Pessoa(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
    
    public int getCodigo() {
        return codigo;
    }
}