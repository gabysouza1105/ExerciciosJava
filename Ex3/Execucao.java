package ExercíciosPOO.Ex3;

import java.util.Scanner;

public class Execucao {
    Scanner leitor = new Scanner(System.in);
    BombaCombustivel bomba = new BombaCombustivel();
    int opcao = 0;

    public void realizarAcao() {
        while (opcao != 7) {
            System.out.println("1 - Abastecer por valor");
            System.out.println("2 - Abastecer por litro");
            System.out.println("3 - Alterar preço do litro");
            System.out.println("4 - Alterar tipo de combustível");
            System.out.println("5 - Ver preço");
            System.out.println("6 - Ver combustível");
            System.out.println("7 - Sair");

            opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Valor:");
                    bomba.abastecerPorValor(leitor.nextFloat());
                    break;
                case 2:
                    System.out.print("Litros:");
                    bomba.abatecerPorLitro(leitor.nextFloat());
                    break;
                case 3:
                    System.out.print("Valor:");
                    bomba.alterarValor(leitor.nextFloat());
                    break;
                case 4:
                    System.out.print("Tipo:");
                    bomba.alterarCombustivel(leitor.next());
                    break;
                case 5:
                    System.out.println("R$ " + bomba.getValorLitro());
                    break;
                case 6:
                    System.out.println(bomba.getTipoCombustivel());
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Escolha uma opção válida");
                    break;
            }
        }
    }
}
