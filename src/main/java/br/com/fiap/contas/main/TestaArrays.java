package br.com.fiap.contas.main;

import br.com.fiap.contas.modelo.Conta;
import br.com.fiap.contas.modelo.ContaCorrente;

import java.util.stream.Stream;

public class TestaArrays {
    public static void main(String[] args) {
        Conta[] contas = new Conta[10];
        for (int i = 0; i < contas.length; i++) {
            Conta conta = new ContaCorrente("pedro", 121, "4112");
            conta.deposita(1 + i * 100);
            contas[i] = conta;
        }

        double mediaDasContas = Stream.of(contas).mapToDouble(Conta::getSaldo).average().orElse(0);
        System.out.println("Média das contas; " + mediaDasContas);
    }
}
