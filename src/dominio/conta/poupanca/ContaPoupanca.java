package dominio.conta.poupanca;

import dominio.conta.Conta;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    @Override
    public String toString() {
        return "ContaPoupanca";
    }

}
