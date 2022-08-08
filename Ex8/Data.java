package ExercíciosPOO.Ex8;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;

public class Data {
    LocalDate data;

    public Data(String strData) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu")
                    .withResolverStyle(ResolverStyle.STRICT);
            LocalDate data = LocalDate.parse(strData, formatter);
            this.data = data;
        } catch (Exception e) {
            strData = "01/01/0001";
            LocalDate data = LocalDate.parse(strData, DateTimeFormatter.ofPattern("dd/MM/uuuu"));
            this.data = data;
        }
    }

    public int comparar() {
        LocalDate dataAtual = LocalDate.now();
        Period periodo = Period.between(dataAtual, data);
        int dias = periodo.getDays();
        if (dias < 0) {
            return -1;
        } else if (dias == 0) {
            return 0;
        } else {
            return 1;
        }

    }

    public int getDia() {
        int dia = data.getDayOfMonth();
        return dia;
    }

    public int getMes() {
        int mes = data.getMonthValue();
        return mes;
    }

    public String getMesExtenso() {
        String[] meses = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro",
                "Outubro", "Novembro", "Dezembro" };
        String strMes = meses[getMes() - 1];
        return strMes;
    }

    public int getAno() {
        int ano = data.getYear();
        return ano;
    }

    public boolean isBissexto() {
        if (getAno() >= 400 && getAno() % 100 == 0 && getAno() % 400 == 0) {
            return true;
        } else if (getAno() % 4 == 0 && getAno() % 100 != 0) {
            return true;
        } else {
            return false;
        }
    }

    public LocalDate getData() {
        return data;
    }
}
