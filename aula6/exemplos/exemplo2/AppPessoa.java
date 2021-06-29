package exemplos.exemplo2;

import java.util.HashMap;

public class AppPessoa {
    public static void main(String[] args) {
        HashMap<Integer, Pessoa> hash = new HashMap<>();

        // put (CHAVE, OBJETO QUE QUERO GUARDAR)
        hash.put(123, new Pessoa(123, "Renata"));
        hash.put(234, new Pessoa(234, "Henrique"));
        hash.put(127, new Pessoa(127, "Augusto"));

        Pessoa p = hash.get(127); // get BUSCA a pessoa que tem esse código

        System.out.println(p.getNome());

        p = hash.get(333);  // retorna null se não encontrar essa pessoa
        if( p != null) {
            System.out.println(p.getNome());
        } else {
            System.out.println("Pessoa não encontrada.");
        }

    }
    
}
