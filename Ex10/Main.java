package ExercíciosPOO.Ex10;

public class Main {
    public static void main(String[] args) {
        try {
            Jogador jogador = new Jogador();

            System.out.println(jogador.calcularIdade());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
