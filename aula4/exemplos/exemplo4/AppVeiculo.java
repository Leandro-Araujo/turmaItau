package exemplos.exemplo4;

public class AppVeiculo {
    public static void main(String[] args) {
        Veiculo v1 = new Veiculo("Chevrolet", "Cruze", -4);
        
        v1.exibir();
        //v1.consumo = -5; // private não pode ser usado

        v1.setConsumo(-12.7);

        System.out.println("Consumo: " + v1.getConsumo());

    }
}
