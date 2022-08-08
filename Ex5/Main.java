package ExercíciosPOO.Ex5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {
            Aluno aluno = new Aluno();
            Menu menu = new Menu();

            System.out.print("Número de matrícula: ");
            aluno.setMatricula(leitor.nextLine());

            System.out.print("Nome: ");
            aluno.setNome(leitor.nextLine());

            System.out.print("Nota da primeira prova: ");
            aluno.setNotaProva1(leitor.nextFloat());

            System.out.print("Nota da segunda prova: ");
            aluno.setNotaProva2(leitor.nextFloat());

            System.out.print("Nota do trabalho: ");
            aluno.setNotaTrabalho(leitor.nextFloat());

            aluno.calcularMedia();
            menu.escolherOpcao(aluno);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
