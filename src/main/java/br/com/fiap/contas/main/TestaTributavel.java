package br.com.fiap.contas.main;

import br.com.fiap.contas.modelo.ContaCorrente;
import br.com.fiap.contas.modelo.Tributavel;

public class TestaTributavel {
    public static void main (String[] args) {
        ContaCorrente cc = new ContaCorrente("pedro", 121, "4112");
        cc.deposita(100);
        System.out.println(cc.getValorImposto());
        Tributavel t = cc;
        System.out.println(t.getValorImposto());
    }
}
