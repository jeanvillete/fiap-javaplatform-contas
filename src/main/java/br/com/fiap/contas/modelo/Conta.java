package br.com.fiap.contas.modelo;

import java.util.Objects;

public abstract class Conta implements Comparable<Conta> {
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
        if (valor <= 0) {
            throw new IllegalArgumentException("Você tentou depositar um valor negativo ou igual a zero");
        }
        this.saldo += valor;
    }

    public void saca(double valor)  {
        if (valor <= 0) {
            throw new IllegalArgumentException("Você tentou sacar um valor negativo ou igual a zero");
        }
        if (valor > this.saldo) {
            throw new SaldoInsuficienteException(valor);
        }
        this.saldo -= valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public abstract String getTipo();

    public void transfere(double valor, Conta contaDestino)  {
        this.saca(valor);
        contaDestino.deposita(valor);
    }

    @Override
    public int compareTo(Conta outraConta) {
        return this.titular.compareTo(outraConta.titular);
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conta conta = (Conta) o;
        return numero == conta.numero &&
                Objects.equals(agencia, conta.agencia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero, agencia);
    }
}
