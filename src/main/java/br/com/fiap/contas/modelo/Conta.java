package br.com.fiap.contas.modelo;

public class Conta {
    private double saldo;
    private String titular;
    private int numero;
    private String agencia;

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public void saca(double valor) {
        this.saldo -= valor;
    }

    public double getSaldo() {
        return saldo;
    }
}
