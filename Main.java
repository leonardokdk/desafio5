package Desafio5;

public class Main {
    public static void main(String[] args) {
        ContaBancaria leonardo = new ContaCorrente(2000);
        ContaBancaria fernando = new ContaPoupanca(2000);

        leonardo.depositar(100);
        fernando.depositar(100);

        System.out.println("Saldo Conta Corrente: " + leonardo.consultarSaldo());
        System.out.println("Saldo Conta Corrente: " + fernando.consultarSaldo());

        BancoKonoha bradesco = new BancoKonoha();
        bradesco.transferencia(leonardo, fernando, 500);

        System.out.println("Saldo conta corrente depois da transferencia: " + leonardo.consultarSaldo());
        System.out.println("Saldo conta poupança depois da transferencia: " + fernando.consultarSaldo());

    }
}
