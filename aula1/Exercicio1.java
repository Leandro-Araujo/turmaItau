import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota1, nota2, media;

        //entrada
        System.out.println("Digite a primeira nota:");
        nota1 = teclado.nextDouble();
        System.out.println("Digite a segunda nota:");
        nota2 = teclado.nextDouble();

        //processamento
        media = (nota1 + nota2) / 2;

        //saída
        System.out.println("Média = " + media);

        teclado.close();
    }
}
