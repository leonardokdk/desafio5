package Desafio5;

public class ContaPoupanca extends ContaBancaria{
    TipoConta tipo;
    public ContaPoupanca(double saldoInicial) {
        super(saldoInicial);
        this.tipo = TipoConta.POUPANCA;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor - (valor * 0.01);
    }

    public TipoConta getTipo(){
        return this.tipo;
    }
}
