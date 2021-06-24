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
