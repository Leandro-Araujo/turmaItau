/*
Escreva um programa que exiba a sequência de números de 100 à 200.
	Exemplo: 100 101 102 103 ... 198 199 200

*/

package exercicios;

public class Exercicio5 {
    public static void main(String[] args) {
        int contador;

        contador = 100;

        while(contador <= 200) {
            System.out.print(contador + " ");
            contador++;
        }

    }
}
