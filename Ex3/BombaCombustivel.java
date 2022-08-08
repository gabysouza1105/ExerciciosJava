package ExercíciosPOO.Ex3;

public class BombaCombustivel {
    private StringBuilder tipoCombustivel = new StringBuilder();
    private float valorLitro = 3.0f;
    private float quantidade;

    public void abastecerPorValor(float valorColocado) {
        float litros = valorColocado / valorLitro;
        System.out.println(litros + " Litros");
        diminuirQuantidadeCombustível(litros);
    }

    public void abatecerPorLitro(float litros) {
        float valor = litros * valorLitro;
        System.out.println("R$ " + valor);
        diminuirQuantidadeCombustível(litros);
    }

    public void alterarValor(float novoValor) {
        valorLitro = novoValor;
    }

    public void alterarCombustivel(String novoTipo) {
        tipoCombustivel.replace(0, tipoCombustivel.length(), novoTipo);
    }

    public void diminuirQuantidadeCombustível(float litros) {
        quantidade -= litros;
    }

    public StringBuilder getTipoCombustivel() {
        return tipoCombustivel;
    }

    public float getValorLitro() {
        return valorLitro;
    }

    public float getQuantidade() {
        return quantidade;
    }
}
