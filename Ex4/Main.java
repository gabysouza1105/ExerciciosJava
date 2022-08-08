package ExercíciosPOO.Ex4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {
            Elevador elevador = new Elevador();
            Opcoes opcoes = new Opcoes();

            System.out.print("Capacidade total do elevador: ");
            int capacidadeTotal = leitor.nextInt();
            System.out.print("Total de andares do prédio: ");
            int totalAndares = leitor.nextInt();

            elevador.inicializar(capacidadeTotal, totalAndares);
            opcoes.escolher(elevador);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
