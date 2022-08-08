package ExercíciosPOO.Ex8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {
            System.out.print("Data: ");
            String strData = leitor.nextLine();
            
            Data data = new Data(strData);
            System.out.println(data.comparar());
            System.out.println(data.getDia());
            System.out.println(data.getMes());
            System.out.println(data.getMesExtenso());
            System.out.println(data.getAno());
            System.out.println(data.isBissexto());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
