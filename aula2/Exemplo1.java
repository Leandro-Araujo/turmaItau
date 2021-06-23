import java.util.Scanner;

public class Exemplo1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int idade;
        
        System.out.println("Digite a sua idade");
        idade = teclado.nextInt();

        if( idade >= 18 ) {
            System.out.println("Você já pode dirigir.");
        } else {
            System.out.println("Você ainda não pode dirigir.");
        }

        teclado.close();
    }

}