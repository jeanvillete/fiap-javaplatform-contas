package br.com.fiap.contas.modelo;

public class ContaCorrente extends Conta {
    public ContaCorrente(String titular, int numero, String agencia) {
        super(titular, numero, agencia);
    }

    public String getTipo(){
        return "Conta Corrente";
    }

    @Override
    public void saca(double valor) {
        this.saldo -= (valor + 0.10);
    }
}
