package ExercíciosPOO.Ex7;

public class Funcionario {
    private String nome;
    private String sobrenome;
    private float salario;
    private float salarioAnual;

    public Funcionario(String nome, String sobrenome, float salario) {
        this.setNome(nome);
        this.setSobrenome(sobrenome);
        this.setSalario(salario);
        this.setSalarioAnual();
    }

    public void darAumento(float aumento) {
        aumento = aumento / 100;
        salario = salario + (salario * aumento);
        setSalarioAnual();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        if (salario < 0) {
            this.salario = 0;
        } else {
            this.salario = salario;
        }
    }

    public float getSalarioAnual() {
        return salarioAnual;
    }

    public void setSalarioAnual() {
        salarioAnual = salario * 12;
    }

    
}
