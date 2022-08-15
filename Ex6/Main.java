package ExercíciosPOO.Ex6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {
            System.out.println("Codigo do item: ");
            int codigoItem = leitor.nextInt();
            System.out.println("Descrição: ");
            // absorver o enter do nextInt
            leitor.nextLine();
            String descricao = leitor.nextLine();
            System.out.println("Quantidade: ");
            int quantidade = leitor.nextInt();
            System.out.println("Preço: ");
            float preco = leitor.nextFloat();

            Invoice inv = new Invoice(codigoItem, descricao, quantidade, preco);

            System.out.println("Preço total: " + inv.getInvoiceAmount());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
