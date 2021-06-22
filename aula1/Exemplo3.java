import java.util.Scanner;

public class Exemplo3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome;

        System.out.println("Informe o seu nome:");
        nome = teclado.nextLine(); // nextDouble()

        System.out.println("Olá " + nome + ". Bem vindo(a)!");

        teclado.close();
    }
}
