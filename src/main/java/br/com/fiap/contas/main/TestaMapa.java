package br.com.fiap.contas.main;

import br.com.fiap.contas.modelo.Conta;
import br.com.fiap.contas.modelo.ContaCorrente;

import java.util.HashMap;
import java.util.Map;

public class TestaMapa {
    public static void main(String[] args) {
        ContaCorrente pedro = new ContaCorrente("pedro", 121, "4112");
        pedro.deposita(10000);

        ContaCorrente arthur = new ContaCorrente("arthur", 121, "4112");
        arthur.deposita(3000);

        final String diretorChaveMapa = "diretor";

        Map<String, Conta> mapaDeContas = new HashMap<String, Conta>(){{
            put(diretorChaveMapa, pedro);
            put("gerente", arthur);
        }};

        Conta contaDiretor = mapaDeContas.get(diretorChaveMapa);
        System.out.println(contaDiretor.getSaldo());

    }
}
