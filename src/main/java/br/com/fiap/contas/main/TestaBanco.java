package br.com.fiap.contas.main;

import br.com.fiap.contas.modelo.Banco;
import br.com.fiap.contas.modelo.Conta;
import br.com.fiap.contas.modelo.ContaCorrente;

import java.util.stream.Stream;

public class TestaBanco {
    public static void main(String[] args) {
        Banco banco = new Banco("meu banco", 1234);

        for (int i = 0; i < 10; i++) {
            Conta conta = new ContaCorrente("usuario de exemplo" + i, 121, "4112");
            conta.deposita(1 + i * 100);

            banco.adiciona(conta, i);
        }

        Stream.of(banco.getContas()).forEach(System.out::println);
    }
}
