/*
Escreva um programa que leia 10 números inteiros e exiba quantos são pares e quantos são ímpares. 

Exemplo:	

Digite o 1º número: 	4
Digite o 2º número: 	-201
.....
Digite o 10º número: 	976

O total de pares é: _____
O total de ímpares é: _____

*/

package exercicios;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        int contaPar, contaImpar;
        final int QTDE_NUMEROS = 10;

        contaPar = 0;
        contaImpar = 0;

        for (int i = 1; i <= QTDE_NUMEROS; i++) {
            System.out.printf("Digite o %d° número inteiro:", i);
            numero = teclado.nextInt();

            if (numero % 2 == 0) {
                contaPar++;
            } else {
                contaImpar++;
            }
        }

        System.out.printf("O total de pares é: %d\n", contaPar);
        System.out.printf("O total de impares é: %d\n", contaImpar);

        teclado.close();
    }
}
