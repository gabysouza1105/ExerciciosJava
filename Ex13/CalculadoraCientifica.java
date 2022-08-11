package ExercíciosPOO.Ex13;

public class CalculadoraCientifica extends Calculadora {
    public CalculadoraCientifica() {
        super();
    }

    public double calcularRaizQuadrada(double n) {
        double resultado = Math.sqrt(n);
        return resultado;
    }

    public double calcularPotencia(double base, double expoente) {
        double resultado = Math.pow(base, expoente);
        return resultado;
    }
}
