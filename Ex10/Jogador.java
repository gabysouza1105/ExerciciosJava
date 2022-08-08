package ExercíciosPOO.Ex10;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Jogador {
    private String nome;
    private String posicao;
    private LocalDate dataNascimento;
    private String nacionalidade;
    private float altura;
    private float peso;

    public void imprimirDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Posição: " + getPosicao());
        System.out.println("Data de nascimento: " + getDataNascimento());
        System.out.println("Nacionalidade: " + getNacionalidade());
        System.out.println("Altura: " + getAltura());
        System.out.println("Peso: " + getPeso());
    }

    public int calcularIdade() {
        int idade = Period.between(dataNascimento, LocalDate.now()).getYears();
        return idade;
    }

    public void verTempoParaAposentar() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento() {
        String strData = "11/11/2000";
        dataNascimento = LocalDate.parse(strData, DateTimeFormatter.ofPattern("dd/MM/uuuu"));
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

}
