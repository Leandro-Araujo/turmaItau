/* 
Faça um programa que leia o salário de uma pessoa e exiba o desconto do INSS segundo a tabela a seguir.

<= R$ 600,00                 ==> Isento
> R$ 600,00 e <= R$ 1200     ==> 20%
> R$ 1200,00 e <= R$ 2000,00 ==> 25%
> R$ 2000,00                 ==> 30%

*/

package exercicios;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario;

        System.out.println("Digite o valor do salário:");
        salario = entrada.nextDouble();

        if (salario <= 600) {
            System.out.println("Isento");
        } else {
            if (salario <= 1200) {
                System.out.println("20%");
            } else {
                if (salario <= 2000) {
                    System.out.println("25%");
                } else {
                    System.out.println("30%");
                }
            }
        }

        entrada.close();
    }
}
