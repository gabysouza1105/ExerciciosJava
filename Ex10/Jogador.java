package ExercíciosPOO.Ex10;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Jogador {
    private String nome;
    private String posicao;
    private LocalDate dataNascimento;
    private String nacionalidade;
    private float altura;
    private float peso;
    Scanner leitor = new Scanner(System.in);

    public Jogador() {
        System.out.print("Nome: ");
        setNome(leitor.nextLine());
        System.out.print("Posição (Defesa, Meio-campo, Atacante): ");
        setPosicao(leitor.next());
        System.out.print("Data de nascimento: ");
        setDataNascimento(leitor.next());
        System.out.print("Nacionalidade: ");
        setNacionalidade(leitor.next());
        System.out.print("Altura: ");
        setAltura(leitor.nextFloat());
        System.out.print("Peso: ");
        setPeso(leitor.nextFloat());
    }

    public void imprimirDados() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu");

        System.out.println("Nome: " + getNome());
        System.out.println("Posição: " + getPosicao());
        System.out.println("Data de nascimento: " + getDataNascimento().format(formatter));
        System.out.println("Nacionalidade: " + getNacionalidade());
        System.out.println("Altura: " + getAltura());
        System.out.println("Peso: " + getPeso());
    }

    public int calcularIdade() {
        int idade = Period.between(dataNascimento, LocalDate.now()).getYears();
        return idade;
    }

    public int calcularTempoParaAposentar() {
        int tempo = 0;

        if (posicao.equalsIgnoreCase("defesa")) {
            tempo = 40 - calcularIdade();
        } else if (posicao.equalsIgnoreCase("meio-campo")) {
            tempo = 38 - calcularIdade();
        } else if (posicao.equalsIgnoreCase("atacante")) {
            tempo = 35 - calcularIdade();
        }

        return tempo;
    }

    public String verTempoParaAposentar() {
        int tempo = calcularTempoParaAposentar();
        String mensagem;

        if (tempo > 1) {
            mensagem = "Faltam " + tempo + " anos para o jogador se aposentar.";
        } else if (tempo < 0) {
            mensagem = "O jogador já está aposentado.";
        } else {
            mensagem = "Falta " + tempo + " ano para o jogador se aposentar";
        }

        return mensagem;
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
        boolean valido = false;

        while (valido == false) {
            if (!(posicao.equalsIgnoreCase("defesa")) && !(posicao.equalsIgnoreCase("meio-campo")) && !(posicao.equalsIgnoreCase("atacante"))) {
                System.out.println("Posição inválida.");
                setPosicao(leitor.next());
                valido = true;
            } else {
                this.posicao = posicao;
                valido = true;
            }
        }
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String strData) {
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
