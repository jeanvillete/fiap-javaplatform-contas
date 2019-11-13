package br.com.fiap.contas.main;

import java.util.LinkedList;
import java.util.List;

public class TestaPerformanceDeAdicionarNaPrimeiraPosicao {
    public static void main(String[] args) {
        System.out.println("Iniciando...");

        List<Integer> teste = new LinkedList<>();
        long inicio = System.currentTimeMillis();

        int total = 30_000;

        for (int i = 0; i < total; i++) teste.add(0, i);

        long fim = System.currentTimeMillis();
        long tempoGasto = fim - inicio;

        System.out.println("Tempo gasto em mili segundos; " + tempoGasto);

    }
}
