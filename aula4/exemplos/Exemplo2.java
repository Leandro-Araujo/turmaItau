package exemplos;

public class Exemplo2 {
    
    public static void main(String[] args) {
        int valor;

        valor = soma(10, 20);

        System.out.println("A soma = " + valor);
    }

    static int soma(int n1, int n2) {
        int resultado;

        resultado = n1 + n2;

        return resultado; // retorna o valor da variável resultado
    }

}
