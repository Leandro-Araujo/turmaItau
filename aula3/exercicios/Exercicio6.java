/*
Escreva um programa que exiba a tabuada do número digitado pelo usuário.

Exemplo: 

valor digitado: 5

5 x 0 = 0
5 x 1 = 5
5 x 2 = 10
...
5 x 10 = 50

*/

package exercicios;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int tabuada, contador;

        System.out.println("Digite o número da tabuada:");
        tabuada = entrada.nextInt();

        contador = 0;
        while (contador <= 10) {
            System.out.printf("%d x %2d = %d\n",tabuada, contador, tabuada * contador);
            contador++;
        }

        entrada.close();
    }
}
