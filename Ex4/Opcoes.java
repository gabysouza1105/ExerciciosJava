package ExercíciosPOO.Ex4;

import java.util.Scanner;

public class Opcoes {
    public void escolher(Elevador elevador) {
        try (Scanner leitor = new Scanner(System.in)) {
            int opcao = 0;

            while (opcao != 5) {
                System.out.println("1 - Entrar");
                System.out.println("2 - Sair");
                System.out.println("3 - Subir");
                System.out.println("4 - Descer");

                opcao = leitor.nextInt();

                switch (opcao) {
                    case 1:
                    elevador.entrar();
                        break;
                    case 2:
                        elevador.sair();
                        break;
                    case 3:
                        elevador.subir();
                        break;
                    case 4:
                        elevador.descer();
                        break;
                    default:
                        System.out.println("Escolha uma opção válida");
                        break;
                }
                System.out.println("Pessoas no elevador: " + elevador.getPessoasDentro());
                System.out.println("Andar atual: " + elevador.getAndarAtual());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
