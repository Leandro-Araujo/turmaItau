/* 
Escreva um método em Java que retorne o menor entre três números inteiros fornecidos como parâmetros.
*/

package exercicios;

public class Exercicio2 {
    public static void main(String[] args) {
        
    }

    static int menor(int n1, int n2, int n3) {
        if(n1 <= n2 && n1 <= n3) {
            return n1;
        }

        if(n2 <= n1 && n2 <= n3) {
            return n2;
        }
        
        return n3;
    }


}
