package ExercíciosPOO.Ex5;

import java.util.Scanner;

public class Menu {
    public void escolherOpcao(Aluno aluno) {
        try (Scanner leitor = new Scanner(System.in)) {
            int opcao = 0;

            while (opcao != 3) {
                System.out.println("1 - Ver média");
                System.out.println("2 - Ver nota necessária na prova final");
                System.out.println("3 - Sair");

                opcao = leitor.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.println("");
                        float media = aluno.getMedia();
                        System.out.println("Média: " + media);
                        break;
                    case 2:
                        System.out.println("");
                        aluno.provaFinal();
                        break;
                    case 3:
                        break;
                    default:
                        System.out.println("Digite uma opção válida.");
                        break;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
