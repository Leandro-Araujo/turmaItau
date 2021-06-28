package exemplos.exemplo1;

public class Gerente extends Funcionario {
    private int nFuncionarios;

    public Gerente(String nome, double salario, int nFuncionarios) {
        super(nome, salario); // super se refere ao Funcionário, a classe PAI do Gerente
        this.nFuncionarios = nFuncionarios;
    }

    @Override
    public String imprimir() {
        String saida = String.format("%s, %.2f, %d", getNome(), getSalario(), nFuncionarios);
        return saida;
    }

    public void aumentarSalario(float perc) {
        super.aumentarSalario(perc + 0.2f);
    }

}
