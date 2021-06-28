package exercicios.exercicio2;

public class AppPessoa {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Ana", "(11) 9876-5432");
        Estudante e = new Estudante("Ricardo", "(12)  98989-9999", "Direito");

        System.out.println(p);
        System.out.println(e);
    }
}
