package fabricas;

import dominio.conta.Conta;
import dominio.conta.corrente.ContaCorrente;
import dominio.conta.poupanca.ContaPoupanca;


public class ContaFabrica {

    public static final int CC = 1;
    public static final int CP = 2;

    public static Conta criar(double saldo,int tipo) {

        if (tipo == CC) {
            return new ContaCorrente(saldo);
        } else if (tipo == CP) {
            return new ContaPoupanca(saldo);
        } else {
            return null;
        }
    }

}