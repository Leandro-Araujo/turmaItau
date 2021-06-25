package exemplos;

public class Exemplo1 {

    public static void main(String[] args) { // main = principal
        linha();
        System.out.println("Meu programa");
        linha(); // chamada do método
        System.out.println("v0.1");
        linha2(5);
        linha2(15);
        linha2(25);
        linha3(20, '*');
        linha3(20, '@');
    }

    static void linha() { // void significa que não tem retorno
        System.out.println("-------------");
    }

    static void linha2(int tamanho) { // tamanho é uma parâmetro, infrmação para o método
        for (int i = 1; i <= tamanho; i++) {
            System.out.print("-");
        }
        System.out.println(); // pula linha
    }

    static void linha3(int tamanho, char simbolo) { // simbolo é outro parâmetro, do tipo caracter
        for (int i = 1; i <= tamanho; i++) {
            System.out.print(simbolo); // escreve o símbolo na tela
        }
        System.out.println();
    }
}