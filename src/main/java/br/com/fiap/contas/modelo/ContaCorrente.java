package br.com.fiap.contas.modelo;

public class ContaCorrente extends Conta implements Tributavel {
    public ContaCorrente(String titular, int numero, String agencia) {
        super(titular, numero, agencia);
    }

    public String getTipo(){
        return "Conta Corrente";
    }

    @Override
    public void saca(double valor)  {
        if (valor <= 0) {
            throw new IllegalArgumentException("Você tentou sacar um valor negativo ou igual a zero");
        }
        if (valor > this.saldo) {
            throw new SaldoInsuficienteException(valor);
        }
        this.saldo -= (valor + 0.10);
    }

    @Override
    public double getValorImposto() {
        return this.getSaldo() * 0.01;
    }
}
