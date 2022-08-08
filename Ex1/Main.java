package ExercíciosPOO.Ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner leitor = new Scanner(System.in)) {
            Pessoa pessoa = new Pessoa();

            System.out.print("Nome: ");
            pessoa.setNome(leitor.nextLine());
            System.out.print("Data de Nascimento: ");
            pessoa.setDataNascimento(leitor.nextLine());
            System.out.print("Altura: ");
            pessoa.setAltura(leitor.nextFloat());

            System.out.println("");
            pessoa.displayDados();
            System.out.println("Idade: " + pessoa.calcularIdade() + " anos");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}