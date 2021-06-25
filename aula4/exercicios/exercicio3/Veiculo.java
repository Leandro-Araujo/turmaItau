package exercicios.exercicio3;

public class Veiculo {
    // atributos
    String marca, modelo;
    double consumo;

    // métodos

    //Construtor
    // this se refere ao próprio objeto
    public Veiculo(String marca, String modelo, double consumo) {
        this.marca = marca;
        this.modelo = modelo;
        this.consumo = consumo;
    }

    // %s = String
    public void exibir() {
        System.out.printf("Modelo: %s Marca: %s\n", modelo, marca);
    }

    public double obterConsumo() {
        return consumo;
    }

}
