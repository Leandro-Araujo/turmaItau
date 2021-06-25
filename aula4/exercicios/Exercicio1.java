/* 
Escreva um método em Java que receba um número inteiro fornecido como parâmetro, e retorne se o número é par ou não.
*/

package exercicios;

public class Exercicio1 {
    public static void main(String[] args) {
        int valor = 10;
        boolean retorno;

        retorno = ehPar(valor);

        // true == true ? true
        // false == true ? false

        if (retorno) { // não precisa fazer (retorno == true)
            System.out.println("Valor par");
        } else {
            System.out.println("Valor ímpar");
        }
    }

    static boolean ehPar(int numero) {
        return (numero % 2 == 0);
    }

/*     static boolean ehPar(int numero) {
        if (numero % 2 == 0) {
            return true;
        } 
        return false;
    } 
*/

/*     static boolean ehPar(int numero) {
        if (numero % 2 == 0) {
            return true;
        } else {
            return false;
        }
    } 
*/

}
