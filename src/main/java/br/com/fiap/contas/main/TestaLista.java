package br.com.fiap.contas.main;

import br.com.fiap.contas.modelo.Conta;
import br.com.fiap.contas.modelo.ContaCorrente;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class TestaLista {
    public static void main(String[] args) {
        List<Conta> contas = Arrays.asList(
                new ContaCorrente("pedro", 121, "4112"),
                new ContaCorrente("paulo", 122, "4112"),
                new ContaCorrente("artur", 124, "4112")
        )
                .stream()
                .peek(conta -> conta.deposita(500 * new Random().nextDouble()))
                .collect(Collectors.toList());

        Collections.sort(contas);

        System.out.println(contas);
    }
}
