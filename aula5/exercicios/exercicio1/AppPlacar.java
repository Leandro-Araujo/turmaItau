package exercicios.exercicio1;

public class AppPlacar {
    public static void main(String[] args) {
        Placar p1 = new Placar();
        Placar p2 = new Placar("Palmeiras", "Santos");
        Placar p3 = new Placar("Palmeiras", "Santos", 1, 0);

        System.out.println(p1.exibir());
        System.out.println(p2.exibir());
        System.out.println(p3.exibir());

        System.out.println(p1);
    }
}
