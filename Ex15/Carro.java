package ExercíciosPOO.Ex15;

public class Carro {
    private double combustivelColocado = 0;
    private double combustivelRestante;
    private double distanciaPercorrida = 0;

    public void abastecer(double combustivelColocado) {
        setCombustivelColocado(combustivelColocado);
    }

    public void andar(double distanciaPercorrida) {
        if (calcularCombustivel() > 0) {
            setDistanciaPercorrida(distanciaPercorrida);
            setCombustivelRestante();
        } else {
            System.out.println("O combustível não é suficiente.");
        }
    }

    public double calcularCombustivel() {
        combustivelRestante = combustivelColocado - (distanciaPercorrida / 15);
        return combustivelRestante;
    }

    public double getCombustivelColocado() {
        return combustivelColocado;
    }

    public void setCombustivelColocado(double combustivelColocado) {
        if (combustivelColocado < 50) {
            this.combustivelColocado += combustivelColocado;
        } else {
            combustivelColocado = 50;
            System.out.println("Tanque cheio");
        }
    }

    public double getCombustivelRestante() {
        return combustivelRestante;
    }

    public void setCombustivelRestante() {
        this.combustivelRestante = calcularCombustivel();
    }

    public double getDistanciaPercorrida() {
        return distanciaPercorrida;
    }

    public void setDistanciaPercorrida(double distanciaPercorrida) {
        this.distanciaPercorrida += distanciaPercorrida;
    }

}
