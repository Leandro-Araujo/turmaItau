package exemplos.exemplo1;

public class AppFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Marcos", 1000);
        Gerente gerente = new Gerente("Rita", 1000, 8);
        Funcionario func2 = new Funcionario("Armando");

        funcionario.aumentarSalario(0.2f);
        gerente.aumentarSalario(0.2f);

        System.out.println(funcionario.imprimir());
        System.out.println(gerente.imprimir());   
        System.out.println(func2.imprimir());  

    }
}
