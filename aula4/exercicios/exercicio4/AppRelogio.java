package exercicios.exercicio4;

public class AppRelogio {
    public static void main(String[] args) {
        Relogio reg = new Relogio(16, 5, 6);


        if(reg.setHora(-4)) {
            System.out.println("Hora alterada");
        } else {
            System.out.println("Hora inválida. Não alterada.");
        }

        reg.setMinuto(-12); // tentativa de atribuir valor inválido

        System.out.println("Hora: " + reg.getHora());
        System.out.println("Minuto: " + reg.getMinuto());
        System.out.println("Segundo: " + reg.getSegundo());

        System.out.println("Hora atual: " + reg.horaAtual());
    }

}
