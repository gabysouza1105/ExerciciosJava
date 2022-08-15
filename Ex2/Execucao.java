package ExercíciosPOO.Ex2;

import java.text.NumberFormat;
import java.util.Scanner;

public class Execucao {
    Scanner leitor = new Scanner(System.in);
    ContaCorrente c;
    NumberFormat moeda = NumberFormat.getCurrencyInstance();

    public void lerDados() {
        try {

            System.out.println("Número da conta: ");
            String numeroConta = leitor.nextLine();
            System.out.println("Nome: ");
            String nome = leitor.nextLine();
            System.out.println("Dejesa informar o saldo? S - Sim / N - Não");
            char informarSaldo = leitor.next().charAt(0);

            // checar resposta
            if (informarSaldo == 's' || informarSaldo == 'S') {
                System.out.println("Saldo: ");
                float saldo = leitor.nextFloat();
                c = new ContaCorrente(numeroConta, nome, saldo);
            } else {
                c = new ContaCorrente(numeroConta, nome);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void realizarAcao() {
        try {
            int opcao = 0;
            while (opcao != 6) {
                System.out.println("");
                System.out.println("1 - Ver saldo");
                System.out.println("2 - Ver dados");
                System.out.println("3 - Realizar depósito");
                System.out.println("4 - Realizar saque");
                System.out.println("5 - Alterar nome");
                System.out.println("6 - Sair");
                System.out.println("");

                opcao = leitor.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.println("Saldo: " + moeda.format(c.getSaldo()));
                        break;
                    case 2:
                        System.out.println("Nome: " + c.getNome());
                        System.out.println("Conta: " + c.getNumeroConta());
                        break;
                    case 3:
                        System.out.println("Valor do depósito:");
                        float valorDeposito = leitor.nextFloat();
                        c.deposito(valorDeposito);
                        break;
                    case 4:
                        System.out.println("Valor do saque:");
                        float valorSaque = leitor.nextFloat();
                        c.saque(valorSaque);
                        break;
                    case 5:
                        System.out.println("Nome:");
                        // absrver enter
                        leitor.nextLine();
                        String novoNome = leitor.nextLine();
                        c.alterarNome(novoNome);
                        break;
                    case 6:
                        break;
                    default:
                        System.out.println("Escolha uma opção válida");
                        break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
