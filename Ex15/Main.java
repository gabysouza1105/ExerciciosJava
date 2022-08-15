package ExercíciosPOO.Ex15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)){
            Carro carro1 = new Carro();
            Carro carro2 = new Carro();
            
            carro1.abastecer(20);
            carro1.andar(200);
            
            carro2.abastecer(30);
            carro2.andar(400);
            
            System.out.println("Distância percorrida carro 1: " + carro1.getDistanciaPercorrida() + " km");
            System.out.println("Combustível restante carro 1: " + carro1.getCombustivelRestante() + " litros");

            System.out.println("");
            System.out.println("Distância percorrida carro 2: " + carro2.getDistanciaPercorrida() + " km");
            System.out.println("Combustível restante carro 2: " + carro2.getCombustivelRestante() + " litros");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
