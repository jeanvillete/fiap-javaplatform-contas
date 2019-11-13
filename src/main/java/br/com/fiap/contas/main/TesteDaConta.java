package br.com.fiap.contas.main;

import br.com.fiap.contas.modelo.Conta;
import br.com.fiap.contas.modelo.ContaCorrente;
import br.com.fiap.contas.modelo.ContaPoupanca;
import br.com.fiap.contas.modelo.SaldoInsuficienteException;

public class TesteDaConta {
    public static void main(String[] args) {
        Conta pedro = new ContaCorrente("pedro", 121, "4112");
        imprimeConta(pedro);

        Conta paulo = new ContaPoupanca("paulo", 126, "4112");
        imprimeConta(paulo);

        try {
            pedro.transfere(100, paulo);
            System.out.println(pedro);
            System.out.println(paulo);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e);
        }

        try {
            pedro.saca(500);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e);
        }
    }

    public static void imprimeConta(Conta conta) {
        try {
            conta.deposita(500);
            conta.saca(250);
            System.out.println("Saldo; " + conta.getSaldo());
            System.out.println("Tipo da Conta; " + conta.getTipo());
        } catch (SaldoInsuficienteException e) {
            System.out.println(e);
        }
    }

}