package exemplos;

public class Exemplo5 {
    public static void main(String[] args) {
        int a, b;
        double c;

        final double PI = 3.1415; // declarar constante

        a = 5;
        b = 10;
        c = 45.127;

        // PI = 12.2; não pode fazer atribuição

        System.out.println("primeiro valor = " + a + " segundo valor = " + b);
        // print formatado
        // (FORMATO, variaveis)
        // %d = inteiro, %f = numero double

        System.out.printf("primeiro valor = %d segundo valor = %d\n", a, b);

        System.out.println("terceiro valor = " + c);
        System.out.printf("terceiro valor = %f\n", c);
        System.out.printf("terceiro valor = %.2f\n", c); // 2 casas decimais
        System.out.printf("terceiro valor = %.2f\n", PI); 
    }
}
