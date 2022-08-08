package ExercíciosPOO.Ex2;

public class ContaCorrente {
    private String numeroConta;
    private StringBuilder nome = new StringBuilder();
    private float saldo = 0;

    public ContaCorrente(String numeroConta, String nome) {
        setNumeroConta(numeroConta);
        setNome(nome);
    }

    public ContaCorrente(String numeroConta, String nome, float saldo) {
        setNumeroConta(numeroConta);
        setNome(nome);
        setSaldo(saldo);
    }

    public void alterarNome(String nome) {
        this.nome.replace(0, this.nome.length(), nome);
    }

    public void deposito(float valor) {
        saldo += valor;
    }

    public void saque(float valor) {
        saldo -= valor;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public StringBuilder getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome.append(nome);
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}
