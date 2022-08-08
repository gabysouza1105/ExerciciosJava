package ExercíciosPOO.Ex5;

public class Alunocopy {
    String matricula;
    String nome;
    float notaProva1;
    float notaProva2;
    float notaTrabalho;
    float media;

    public void calcularMedia(float prova1, float prova2, float trabalho) {
        setNotaProva1(prova1);
        setNotaProva2(prova2);
        setNotaTrabalho(trabalho);

        float calculoMedia = (notaProva1 + notaProva2 + notaTrabalho) / 3;
        setMedia(calculoMedia);
    }

    public void provaFinal() {
        if (media > 2) {
            System.out.println("Você foi reprovado.");
        } else if (media < 7) {
            float notaNecessaria = 10 - media;
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
}
