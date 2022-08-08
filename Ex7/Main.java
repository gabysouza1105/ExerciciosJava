package ExercíciosPOO.Ex7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {
            System.out.print("Primeiro nome: ");
            String nome1 = leitor.next();
            System.out.print("Primeiro sobrenome: ");
            String sobrenome1 = leitor.next();
            System.out.print("Primeiro salário: ");
            float salario1 = leitor.nextFloat();

            System.out.println("");
            System.out.print("Segundo nome: ");
            String nome2 = leitor.next();
            System.out.print("Segundo sobrenome: ");
            String sobrenome2 = leitor.next();
            System.out.print("Segundo salário: ");
            float salario2 = leitor.nextFloat();
            System.out.println("");

            Funcionario funcionario1 = new Funcionario(nome1, sobrenome1, salario1);
            Funcionario funcionario2 = new Funcionario(nome2, sobrenome2, salario2);

            System.out.println("Salário anual " + nome1 + sobrenome1 + ": " + funcionario1.getSalarioAnual());
            System.out.println("Salário anual " + nome2 + sobrenome2 + ": " + funcionario2.getSalarioAnual());
            System.out.println("");
            
            funcionario1.darAumento(10);
            funcionario2.darAumento(10);
            
            System.out.println("Salário com aumento " + nome1 + sobrenome1 + ": " + funcionario1.getSalario());
            System.out.println("Salário com aumento " + nome2 + sobrenome2 + ": " + funcionario2.getSalario());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
