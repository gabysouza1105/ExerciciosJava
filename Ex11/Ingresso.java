package ExercíciosPOO.Ex11;

import java.text.NumberFormat;

public class Ingresso {
    protected float valor = 20f;

    public void imprimirValor() {
        System.out.println("Preço do ingresso: " + NumberFormat.getCurrencyInstance().format(valor));
    }
}
