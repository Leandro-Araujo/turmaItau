package exemplos.exemplo1;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        setSalario(salario);
    }
    
    public Funcionario(String nome) {
        this.nome = nome;
        salario = 0;
    }

    private void setSalario(double novoSalario) {
        if(novoSalario > 0) {
            salario = novoSalario;
        }
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public String imprimir() {
        String saida = String.format("%s - %.2f", nome, salario);
        return saida;
    }

    public void aumentarSalario(float perc) {
        salario = salario + (salario * perc);
    }
}