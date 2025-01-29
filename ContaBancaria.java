package Desafio5;

public class ContaBancaria implements Conta{
    double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    @Override
    public double consultarSaldo() {
        return this.saldo;
    }

    @Override
    public void depositar(double valor) {

    }
}
