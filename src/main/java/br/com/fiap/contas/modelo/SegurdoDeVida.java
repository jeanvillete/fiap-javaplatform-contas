package br.com.fiap.contas.modelo;

public class SegurdoDeVida implements Tributavel {

    private double valor;
    private String titular;
    private int numeroApolice;

    @Override
    public double getValorImposto() {
        return 42 + this.valor * 0.2;
    }

    public String getTipo(){
        return "Segurdo de Vida";
    }
}
