package ExercíciosPOO.Ex16;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {
            Agenda agenda = new Agenda();
            int opcao = 0;

            agenda.agendarCompromisso("nome", "11/11/2020", "participante", "12345678911");
            // agenda.excluirCompromisso("nome");
            while (opcao != 7) {
                System.out.println("");
                System.out.println("1 - Agendar Compromisso");
                System.out.println("2 - Editar Compromisso");
                System.out.println("3 - Excluir Compromisso");
                System.out.println("4 - Ver Agenda");
                System.out.println("5 - Procurar Compromisso por Participante");
                System.out.println("6 - Procurar Compromisso por Data");
                System.out.println("7 - Sair");

                opcao = leitor.nextInt();
                // absorver enter
                leitor.nextLine();

                switch (opcao) {
                    case 1:
                        System.out.print("Nome: ");
                        String nome = leitor.nextLine();
                        System.out.print("Data: ");
                        String strData = leitor.nextLine();
                        System.out.print("Participante: ");
                        String participante = leitor.nextLine();
                        System.out.print("Telefone: ");
                        String telefone = leitor.next();
                        agenda.agendarCompromisso(nome, strData, participante, telefone);
                        break;
                    case 2:
                        System.out.print("Nome: ");
                        String nomeAlterar = leitor.nextLine();
                        agenda.alterarCompromisso(nomeAlterar, leitor);
                        break;
                    case 3:
                        System.out.print("Nome: ");
                        String nomeExcluir = leitor.next();
                        agenda.excluirCompromisso(nomeExcluir);
                        break;
                    case 4:
                        agenda.imprimirAgenda();
                        break;
                    case 5:
                        System.out.print("Nome: ");
                        String nomeProcurar = leitor.nextLine();
                        agenda.imprimirPorParticipante(nomeProcurar);
                        break;
                    case 6:
                        System.out.print("Data: ");
                        String data = leitor.nextLine();
                        agenda.imprimirPorData(data);
                        break;
                    case 7:
                        break;
                    default:
                        System.out.println("Digite uma opção válida");
                        break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
