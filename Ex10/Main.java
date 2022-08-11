package ExercíciosPOO.Ex10;

public class Main {
    public static void main(String[] args) {
        try {
            Jogador jogador = new Jogador();

            jogador.imprimirDados();
            System.out.println("idade: " + jogador.calcularIdade());
            System.out.println(jogador.verTempoParaAposentar());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
