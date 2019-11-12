package br.com.fiap.contas.modelo;

public class Conta {
    protected double saldo;

    private String titular;
    private int numero;
    private String agencia;

    public Conta(String titular, int numero, String agencia) {
        this.titular = titular;
        this.numero = numero;
        this.agencia = agencia;
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public void saca(double valor) {
        this.saldo -= valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTipo(){
        return "Conta ";
    }

    public void transfere(double valor, Conta contaDestino) {
        this.saca(valor);
        contaDestino.deposita(valor);
    }

    @Override
    public String toString() {
        return "Conta{" +
                "saldo=" + saldo +
                ", titular='" + titular + '\'' +
                ", numero=" + numero +
                ", agencia='" + agencia + '\'' +
                '}';
    }
}
