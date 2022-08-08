package ExercíciosPOO.Ex9;

import java.util.Arrays;
import java.util.Scanner;

public class Execucao {
    public void executar() {
        try (Scanner leitor = new Scanner(System.in)) {
            int opcao = 0;

            System.out.print("Número do vôo: ");
            String numeroVoo = leitor.nextLine();

            Voo voo = new Voo(numeroVoo);

            while (opcao != 5) {
                System.out.println("");
                System.out.println("1 - Ver lugares disponíveis");
                System.out.println("2 - Verificar lugar");
                System.out.println("3 - Reservar lugar");
                System.out.println("4 - Ver número do vôo");
                System.out.println("5 - Sair");
                System.out.println("");

                opcao = leitor.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.println("");
                        System.out.println(Arrays.toString(voo.verLugaresLivres()));
                        break;
                    case 2:
                        System.out.println("");
                        System.out.print("Número da cadeira: ");
                        int cadeiraVerificar = leitor.nextInt();
                        System.out.println(voo.verificarLugar(cadeiraVerificar));
                        break;
                    case 3:
                        System.out.println("");
                        System.out.print("Número da cadeira: ");
                        int cadeiraOcupar = leitor.nextInt();
                        System.out.println(voo.ocuparLugar(cadeiraOcupar));
                        break;
                    case 4:
                        System.out.println("");
                        System.out.println(voo.verVoo());
                        break;
                    case 5:
                        break;
                    default:
                        System.out.println("");
                        System.out.println("Escolha uma opção válida");
                        break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
