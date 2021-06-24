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
