package br.com.fiap.contas.main;

import java.util.ArrayList;
import java.util.Collection;

public class TestaPerformance {
    public static void main(String[] args) {
        System.out.println("Iniciando... Inserindo e pesquisando números com ArrayList");

        Collection<Integer> teste = new ArrayList<>();
        long inicio = System.currentTimeMillis();

        int total = 30_000;

        for (int i = 0; i < total; i++) teste.add(i);
        for (int i = 0; i < total; i++) teste.contains(i);

        long fim = System.currentTimeMillis();
        long tempoGasto = fim - inicio;

        System.out.println("Tempo gasto em mili segundos; " + tempoGasto);
    }
}
