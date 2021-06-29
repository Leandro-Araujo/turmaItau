package exemplos.exemplo1;

import java.util.ArrayList;

public class AppPessoa {
    public static void main(String[] args) {
        ArrayList<Pessoa> lista = new ArrayList<>();
        
        Pessoa p = new Pessoa("Marcos");

        System.out.println("antes vazia? " + lista.isEmpty()); // isEmpty retorna se a lista está vazia(true) ou não (false)
        lista.add(p); // adiona 'p' na lista
        System.out.println("depois vazia? " + lista.isEmpty());

        lista.add(new Pessoa("Renata"));
        lista.add(new Pessoa("Paulo"));
        lista.add(new Pessoa("Humberto"));

        System.out.println("Pessoas na lista: " + lista.size()); //size retorna quantos itens temos na lista

        for(int i=0; i < lista.size(); i++) {
            System.out.println(lista.get(i).getNome()); // get(i) retorna o objeto da posiçã 'i', getNome retorna o nome
        }

        //for each = para cada
        for (Pessoa pessoaDaLista : lista) { // para cada pessoa da lista faça
            System.out.print(pessoaDaLista.getNome() + " ");
        }

    }

}
