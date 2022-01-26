package dominio.conta;

public interface IConta {
    
    void sacar(Conta conta, double valor, String data);

    void depositar(Conta conta, double valor, String data);

    void transferir(Conta contaOrigem,Conta contaDestino, double valor, String data);
}
