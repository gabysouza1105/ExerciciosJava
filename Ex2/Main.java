package ExercíciosPOO.Ex2;

public class Main {
    public static void main(String[] args) {
        try {

            Execucao e = new Execucao();

            e.lerDados();
            e.realizarAcao();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}