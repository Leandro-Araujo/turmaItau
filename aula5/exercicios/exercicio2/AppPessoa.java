package exercicios.exercicio2;

public class AppPessoa {
    public static void main(String[] args) {
        // Pessoa p = new Pessoa("Ana", "(11) 9876-5432");
        Estudante e = new Estudante("Ricardo", "(12)  98989-9999", "Direito");
        Professor pr = new Professor("Rodrigo", "(15) 91111-2222", 3000);

        // System.out.println(p);
        System.out.println(e);
        System.out.println(pr);


        Pessoa p1 = e; // Estudante É UMA Pessoa
        Pessoa p2 = pr; // Professor É UMA Pessoa

        System.out.println(p1);
        System.out.println(p2);

    }
}
