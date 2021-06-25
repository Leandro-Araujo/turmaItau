package exemplos.exemplo3;

public class AppPessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Emerson", 47);
        Pessoa p2 = new Pessoa("Karina", 40);

        // p1.nome = "Emerson";
        // p1.idade = 47;
        p1.apresentar();

        // p2.nome = "Karina";
        // p2.idade = 40;
        p2.apresentar();
    }

}
