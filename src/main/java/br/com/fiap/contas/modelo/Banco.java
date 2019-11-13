package br.com.fiap.contas.modelo;

public class Banco {
    private String nome;
    private int numero;
    private Conta[] contas;

    public Banco(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
        this.contas = new Conta[10];
    }

    public void adiciona(Conta conta, int index) {
        if (index > 9 || index < 0) {
            throw new IllegalArgumentException("O indice deve ser entre 0 e 9");
        }
        if(conta == null) {
            throw new IllegalArgumentException("A instancia de conta não pode ser nulo");
        }
        this.contas[index] = conta;
    }

    public Conta[] getContas() {
        return contas;
    }
}
