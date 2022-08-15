package ExercíciosPOO.Ex16;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Agenda {
    private List<Compromisso> agenda = new ArrayList<>();

    public void agendarCompromisso(String nome, String strData, String participante, String telefone) {
        Compromisso compromisso = new Compromisso(nome, strData, participante, telefone);
        if (!agenda.contains(compromisso)) {
            agenda.add(compromisso);
        }
    }

    public void excluirCompromisso(String nome) {
        agenda.removeIf(Compromisso -> Compromisso.getNome().equals(nome));
    }

    public void alterarCompromisso(String nomeCompromisso, Scanner leitor) {
        for (Compromisso compromisso : agenda) {
            if (compromisso.getNome().equalsIgnoreCase(nomeCompromisso)) {
                
                System.out.println(
                        "Alterar: \n1 - Compromisso \n2 - Data \n3 - Participante \n4 - Telefone \n5 - Cancelar");
                int opcao = leitor.nextInt();

                switch (opcao) {
                    case 1:
                        // absorver enter
                        leitor.nextLine();

                        String novoNome = leitor.nextLine();
                        compromisso.setNome(novoNome);
                        break;
                    case 2:
                        String novaData = leitor.next();
                        compromisso.setData(novaData);
                        break;
                    case 3:
                        // absorver enter
                        leitor.nextLine();

                        String novoParticipante = leitor.nextLine();
                        compromisso.setParticipante(novoParticipante);
                        break;
                    case 4:
                        String novoTelefone = leitor.next();
                        compromisso.setTelefone(novoTelefone);
                        break;
                    case 5:
                        break;
                    default:
                        System.out.println("Opção inválida");
                        break;
                }
            }
        }
    }

    public void imprimirAgenda() {
        for (Compromisso compromisso : agenda) {
            System.out.println("Compromisso: " + compromisso.getNome());
            System.out.println("Data: " + compromisso.getData());
            System.out.println("Participante: " + compromisso.getParticipante());
            System.out.println("Telefone: " + compromisso.getTelefone());
            System.out.println("");
        }
    }

    public void imprimirPorParticipante(String participante) {
        for (Compromisso compromisso : agenda) {
            if (compromisso.getParticipante().equalsIgnoreCase(participante)) {
                System.out.println("Compromisso: " + compromisso.getNome());
                System.out.println("Data: " + compromisso.getData());
                System.out.println("Participante: " + compromisso.getParticipante());
                System.out.println("Telefone: " + compromisso.getTelefone());
                System.out.println("");
            }
        }
    }

    public void imprimirPorData(String data) {
        for (Compromisso compromisso : agenda) {
            if (compromisso.getData().equals(data)) {
                System.out.println("Compromisso: " + compromisso.getNome());
                System.out.println("Data: " + compromisso.getData());
                System.out.println("Participante: " + compromisso.getParticipante());
                System.out.println("Telefone: " + compromisso.getTelefone());
                System.out.println("");
            }
        }
    }
}
