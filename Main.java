package Desafio5;

public class Main {
    public static void main(String[] args) {
        ContaBancaria leonardo = new ContaCorrente(1000);
        ContaBancaria fernando = new ContaPoupanca(1000);

        leonardo.depositar(1000);
        fernando.depositar(1000);

        System.out.println("Saldo Conta Corrente: " + leonardo.consultarSaldo());
        System.out.println("Saldo Conta Corrente: " + fernando.consultarSaldo());

        BancoKonoha bradesco = new BancoKonoha();
        bradesco.transferencia(leonardo, fernando, 500);

        System.out.println("Saldo conta corrente depois da transferencia: " + fernando.consultarSaldo());
        System.out.println("Saldo conta corrente depois da transferencia: " + fernando.consultarSaldo());

    }
}
