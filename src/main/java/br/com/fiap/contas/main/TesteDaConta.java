package br.com.fiap.contas.main;

import br.com.fiap.contas.modelo.Conta;
import br.com.fiap.contas.modelo.ContaCorrente;
import br.com.fiap.contas.modelo.ContaPoupanca;

public class TesteDaConta {
    public static void main(String[] args) {
        Conta pedro = new ContaCorrente("pedro", 121, "4112");
        imprimeConta(pedro);

        Conta paulo = new ContaPoupanca("paulo", 126, "4112");
        imprimeConta(paulo);

        pedro.transfere(100, paulo);
        System.out.println(pedro);
        System.out.println(paulo);
    }

    public static void imprimeConta(Conta conta) {
        conta.deposita(500);
        conta.saca(250);
        System.out.println("Saldo; " + conta.getSaldo());
        System.out.println("Tipo da Conta; " + conta.getTipo());
    }

}