package ExercíciosPOO.Ex12;

public class Main {
    public static void main(String[] args) {
        try {
            Agenda a = new Agenda();

            a.armazenarPessoa("Ana", 21, 1.65f);
            a.armazenarPessoa("Pedro", 31, 1.85f);
            a.armazenarPessoa("Pedro2", 31, 1.85f);

            a.removerPessoa("Pedro2");

            int posicao = a.buscarPessoa("Pedro2");
            if (posicao == -1) {
                System.out.println("O nome não está na agenda.");
            } else {
                System.out.println("O nome está na posição: " + posicao);
            }
            System.out.println("");
            
            a.imprimirPessoa(0);
            System.out.println("");
            
            a.imprimirAgenda();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
