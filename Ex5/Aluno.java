package ExercíciosPOO.Ex5;

public class Aluno {
    private String matricula;
    private String nome;
    private float notaProva1;
    private float notaProva2;
    private float notaTrabalho;
    private float media;
    private float notaNecessaria;

    public void calcularMedia() {
        float calculoMedia = (notaProva1 + notaProva2 + notaTrabalho) / 3;
        setMedia(calculoMedia);
    }

    public void provaFinal() {
        if (media < 3) {
            System.out.println("Você foi reprovado.");
        } else if (media < 7) {
            notaNecessaria = 10 - media;
            System.out.println("Você precisa tirar no mínimo " + notaNecessaria + " para passar.");
        } else {
            System.out.println("Você não precisa fazer a prova final.");
        }
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getNotaProva1() {
        return notaProva1;
    }

    public void setNotaProva1(float notaProva1) {
        this.notaProva1 = notaProva1;
    }

    public float getNotaProva2() {
        return notaProva2;
    }

    public void setNotaProva2(float notaProva2) {
        this.notaProva2 = notaProva2;
    }

    public float getNotaTrabalho() {
        return notaTrabalho;
    }

    public void setNotaTrabalho(float notaTrabalho) {
        this.notaTrabalho = notaTrabalho;
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }

    public float getNotaNecessaria() {
        return notaNecessaria;
    }

    public void setNotaNecessaria(float notaNecessaria) {
        this.notaNecessaria = notaNecessaria;
    }

}
