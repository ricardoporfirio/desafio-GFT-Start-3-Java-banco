package dominio.conta.corrente;

import dominio.conta.Conta;

public class ContaCorrente extends Conta{

    public ContaCorrente(double saldo) {
        super(saldo);
    }

    public ContaCorrente() {
        super(0);
    }

    @Override
    public String toString() {
        return "Conta Corrente";
    }

}
