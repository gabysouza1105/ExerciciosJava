package ExercíciosPOO.Ex14;

import java.util.Scanner;

public class FaturaTeste {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)){
            System.out.print("Digite o número: ");
            String numero = leitor.nextLine();

            System.out.print("Digite a descrição: ");
            String descricao = leitor.nextLine();
            
            System.out.print("Digite a quantidade: ");
            int qtdComprada = leitor.nextInt();
            
            System.out.print("Digite o preço unitário: ");
            double precoUnitario = leitor.nextDouble();
            
            System.out.println("");
            Fatura fatura = new Fatura(numero, descricao, qtdComprada, precoUnitario);
            System.out.println("Número: "+ fatura.getNumero());
            System.out.println("Descrição: "+ fatura.getDescricao());
            System.out.println("Quantidade: "+ fatura.getQtdComprada() + " unidades");
            System.out.println("Preço unitário: "+ fatura.getPrecoUnitario());
            System.out.println("Total: "+ fatura.getTotalFatura());
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
