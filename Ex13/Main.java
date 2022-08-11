package ExercíciosPOO.Ex13;

public class Main {
    public static void main(String[] args) {
        try {
            CalculadoraCientifica calculadoraCientifica = new CalculadoraCientifica();
            Calculadora calculadora = new Calculadora();

            System.out.println("Calculadora Simples:");
            System.out.println("Soma: " + calculadora.somar(20d, 45d));
            System.out.println("Subtração: " + calculadora.subtrair(45d, 20d));
            System.out.println("Divisão: " + calculadora.dividir(20d, 8d));
            System.out.println("Multipicação: " + calculadora.multiplicar(20d, 5d));

            System.out.println("");
            System.out.println("Calculadora Científica:");
            System.out.println("Soma: " + calculadoraCientifica.somar(16d, 32d));
            System.out.println("Subtração: " + calculadoraCientifica.subtrair(45d, 20d));
            System.out.println("Divisão: " + calculadoraCientifica.dividir(32d, 5d));
            System.out.println("Multiplicação: " + calculadoraCientifica.multiplicar(20d, 5d));
            System.out.println("Raiz Quadrada: " + calculadoraCientifica.calcularRaizQuadrada(16d));
            System.out.println("Potência: " + calculadoraCientifica.calcularPotencia(2d, 5d));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
