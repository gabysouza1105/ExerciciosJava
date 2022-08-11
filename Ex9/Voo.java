package ExercíciosPOO.Ex9;

import java.util.Arrays;
import java.util.List;

import ExercíciosPOO.Ex8_2.Data;

public class Voo {
    private Data data;
    private String numeroVoo;
    private Boolean[] lugares = new Boolean[25];

    public Voo(String numeroVoo) {
        this.numeroVoo = numeroVoo;
        data = new Data();

        for (int i = 0; i < lugares.length; i++) {
            lugares[i] = true;
        }
    }

    public int[] verLugaresLivres() {
        int[] lugaresLivres = new int[25];

        for (int i = 0; i < lugares.length; i++) {
            if (lugares[i] == true) {
                lugaresLivres[i] = i + 1;
            } 
        }

        return lugaresLivres;
    }

    public String verificarLugar(int cadeira) {
        String disponibilidade;

        if (lugares[cadeira - 1] == true) {
            disponibilidade = "Livre";
        } else {
            disponibilidade = "Ocupado";
        }

        return disponibilidade;
    }

    public String ocuparLugar(int cadeira) {
        String resposta;

        if (verificarLugar(cadeira) == "Livre") {
            lugares[cadeira - 1] = false;
            resposta = "Cadeira reservada com sucesso";
        } else {
            resposta = "Cadeira já ocupada";
        }

        return resposta;
    }

    public String verVoo() {
        return numeroVoo;
    }
}
