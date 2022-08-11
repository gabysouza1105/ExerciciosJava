package ExercíciosPOO.Ex11;

public class Main {
    public static void main(String[] args) {
        try {
            Ingresso ingresso = new Ingresso();
            IngressoVIP ingressoVIP = new IngressoVIP();

            ingresso.imprimirValor();
            ingressoVIP.imprimirValorVIP();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
