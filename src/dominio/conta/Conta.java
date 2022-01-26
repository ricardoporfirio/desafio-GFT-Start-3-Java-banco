package dominio.conta;

import java.util.ArrayList;

public abstract class Conta {

    private int agencia;
    private int numero;
    private double saldo;
    private ArrayList<Transacao> transacoes;

    private static final int AGENCIA_PADRAO = 1;
    private static int NUMERO_PADRAO = 1;

    public Conta(double saldo) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = NUMERO_PADRAO++;
        this.saldo = saldo;
        this.transacoes = new ArrayList<Transacao>();
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Conta setSaldo(double saldo) {
        this.saldo = saldo;
        return this;
    }

    public Conta setTrasacao(Transacao transacao) {
        this.transacoes.add(transacao);
        return this;
    }

    public ArrayList<Transacao> getTransacoes() {
        return transacoes;
    }

}
