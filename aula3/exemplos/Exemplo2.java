package exemplos;

import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome;

        System.out.println("Digite o seu nome:");
        nome = entrada.nextLine();

        if(nome.equalsIgnoreCase("Emerson") ==  true) { // equals = exatmente igual
            System.out.println("Bem vindo!");
        } else {
            System.out.println("Acesso negado.");
        }

        entrada.close();
    }
}
