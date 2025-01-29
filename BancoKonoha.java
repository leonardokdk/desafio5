package Desafio5;

public class BancoKonoha {
    public void transferencia(ContaBancaria origem, ContaBancaria destino, double valor){
        if(origem.consultarSaldo() >= valor){
            origem.depositar(-valor);
            destino.depositar(valor);
            System.out.println("Transferencia concluida.");
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
}
