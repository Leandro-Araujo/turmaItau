package exemplos;

public class Exemplo4 {
    public static void main(String[] args) {
        int contador;

        contador = 1; // inicialização

        while (contador < 11) { // enquanto o contador for menor que 5
            System.out.println(contador);
            // contador++; // somar 1 na variável
            contador = contador + 2; // passo: 2 em 2
        }
        System.out.println("Final com contador = " + contador);
    }
}
