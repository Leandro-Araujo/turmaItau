package exemplos.exemplo4;

public class Veiculo {
    // atributos
    String marca, modelo;
    private double consumo; // private = só dentro da classe

    // métodos

    //Construtor
    public Veiculo(String marca, String modelo, double consumo) {
        this.marca = marca;
        this.modelo = modelo;
        setConsumo(consumo);
    }

    public void exibir() {
        System.out.printf("Modelo: %s Marca: %s\n", modelo, marca);
    }

    // get = obter o valor do atributo
    public double getConsumo() {
        return consumo;
    }

    // set = alterar o valor do atributo
    public void setConsumo(double novoConsumo) {
        if(novoConsumo > 0) {
            consumo = novoConsumo;
        }
    }

}
