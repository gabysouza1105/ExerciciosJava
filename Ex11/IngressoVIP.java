package ExercíciosPOO.Ex11;

import java.text.NumberFormat;

public class IngressoVIP extends Ingresso{
    private float adicional = 10f;
    private float totalVIP;

    public IngressoVIP(){
        super();
    }

    public void imprimirValorVIP() {
        totalVIP = super.valor + adicional;
        System.out.println("Preço do ingresso VIP: " + NumberFormat.getCurrencyInstance().format(totalVIP));
    }
}
