package exercicios;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario, prestacao, limite;

        // entrada
        System.out.println("Digite o valor do salário:");
        salario = entrada.nextDouble();
        System.out.println("Digite o valor da prestação:");
        prestacao = entrada.nextDouble();

        // processamento
        limite = salario * 0.3;

        // saída
        if (prestacao <= limite) {
            System.out.println("Pode receber o emprestimo.");
        } else {
            System.out.println("O emprestimo não pode ser feito.");
            System.out.println("Seu limite é " + limite);
        }

        entrada.close();
    }
}
