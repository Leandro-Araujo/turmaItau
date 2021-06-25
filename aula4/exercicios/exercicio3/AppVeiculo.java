/* 
Crie a classe veículo, com os atributos modelo, marca e consumo (quantos km/l).
Faça um construtor para inicializar os atributos da classe.
Escreva um método para exibir os dados do carro (modelo, marca) e outro para retornar o valor do consumo.
Faça o main para testar a classe criada.

*/

package exercicios.exercicio3;

public class AppVeiculo {
    public static void main(String[] args) {
        Veiculo v1 = new Veiculo("Chevrolet", "Cruze", 8.5);
        
        v1.exibir();
        v1.consumo = -5;

        System.out.println("Consumo: " + v1.obterConsumo());
    }
}
