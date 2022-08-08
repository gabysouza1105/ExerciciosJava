package ExercíciosPOO.Ex4;

public class Elevador {
    private int andarAtual;
    private int totalAndares;
    private int capacidadeTotal;
    private int pessoasDentro;

    public void inicializar(int capacidadeTotal, int totalAndares) {
        andarAtual = 0;
        pessoasDentro = 0;
        this.capacidadeTotal = capacidadeTotal;
        this.totalAndares = totalAndares;
    }

    public void entrar() {
        if (capacidadeTotal > pessoasDentro) {
            pessoasDentro++;
        } 
    }

    public void sair() {
        if (pessoasDentro > 0) {
            pessoasDentro--;
        }
    }

    public void subir() {
        if (andarAtual < totalAndares) {
            andarAtual++;
        }
    }

    public void descer() {
        if (andarAtual > 0) {
            andarAtual--;
        }
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public int getCapacidadeTotal() {
        return capacidadeTotal;
    }

    public int getPessoasDentro() {
        return pessoasDentro;
    }
}
