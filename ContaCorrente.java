package Desafio5;

public class ContaCorrente extends ContaBancaria{
    TipoConta tipo;
    public ContaCorrente(double saldoInicial) {
        super(saldoInicial);
        this.tipo = TipoConta.CORRENTE;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }
    public TipoConta getTipo(){
        return this.tipo;
    }
}
