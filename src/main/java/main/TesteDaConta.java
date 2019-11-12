package main;

import conta.Conta;

public class TesteDaConta {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.deposita(500);
        conta.saca(250);
        System.out.println("Saldo; " + conta.getSaldo());
    }
}