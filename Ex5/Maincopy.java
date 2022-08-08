package ExercíciosPOO.Ex5;

import java.util.Scanner;

public class Maincopy {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {
            Alunocopy aluno = new Alunocopy();

            System.out.print("Número de matrícula: ");
            aluno.setMatricula(leitor.next());

            System.out.print("Nome: ");
            aluno.setNome(leitor.nextLine());

            System.out.print("Nota da primeira prova: ");
            float prova1 = leitor.nextFloat();

            System.out.print("Nota da segunda prova: ");
            float prova2 = leitor.nextFloat();

            System.out.print("Nota do trabalho: ");
            float trabalho = leitor.nextFloat();

            aluno.calcularMedia(prova1, prova2, trabalho);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
