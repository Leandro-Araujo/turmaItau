package exercicios;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int lado1, lado2, lado3;
        boolean ehTriangulo; // true ou false // camelCase

        System.out.println("Digite o valor dos 3 lados:");
        lado1 = teclado.nextInt();
        lado2 = teclado.nextInt();
        lado3 = teclado.nextInt();

        ehTriangulo = (lado1 <= lado2 + lado3) && (lado2 <= lado1 + lado3) && (lado3 <= lado1 + lado2);

        if (ehTriangulo) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Triângulo equilátero");
            } else {
                if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                    System.out.println("Triangulo isósceles");
                } else {
                    System.out.println("Triângulo escaleno");
                }
            }
        } else {
            System.out.println("Não é um triangulo.");
        }

        teclado.close();
    }
}
