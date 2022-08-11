package ExercíciosPOO.Ex14;

public class Fatura {
    private String numero;
    private String descricao;
    private int qtdComprada;
    private double precoUnitario;

    public Fatura(String numero, String descricao, int qtdComprada, double precoUnitario) {
        setNumero(numero);
        setDescricao(descricao);
        setQtdComprada(qtdComprada);
        setPrecoUnitario(precoUnitario);
    }

    public double getTotalFatura() {
        double valorFatura = qtdComprada * precoUnitario;
        return valorFatura;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQtdComprada() {
        return qtdComprada;
    }

    public void setQtdComprada(int qtdComprada) {
        if (qtdComprada > 0) {
            this.qtdComprada = qtdComprada;
        } else {
            this.qtdComprada = 0;
        }
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        if (precoUnitario > 0) {
            this.precoUnitario = precoUnitario;
        } else {
            this.precoUnitario = 0;
        }
    }

}
