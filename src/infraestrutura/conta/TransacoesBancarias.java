package infraestrutura.conta;

import dominio.conta.Conta;
import dominio.conta.IConta;
import dominio.conta.Transacao;

public class TransacoesBancarias implements IConta {

    @Override
    public void sacar(Conta conta, double valor, String data) {
        if (conta.getSaldo() >= valor) {
            conta.setSaldo(conta.getSaldo() - valor);
            conta.setTrasacao(new Transacao(data, Transacao.SAQUE, valor));
            return;
        }
        throw new RuntimeException("Saldo insuficiente");
    }

    @Override
    public void depositar(Conta conta, double valor, String data) {
        if(valor>0) {
            conta.setSaldo(conta.getSaldo() + valor);
            conta.setTrasacao(new Transacao(data, Transacao.DEPOSITO, valor));
            return;
        }
        throw new RuntimeException("Valor deve ser positivo");
    }

    @Override
    public void transferir(Conta contaOrigem, Conta contaDestino, double valor, String data) {
        if (contaOrigem.getSaldo() >= valor) {
            contaOrigem.setSaldo(contaOrigem.getSaldo() - valor);
            contaOrigem.setTrasacao(new Transacao(data, Transacao.TRANSFERENCIA, valor));
            contaDestino.setSaldo(contaDestino.getSaldo() + valor);
            contaDestino.setTrasacao(new Transacao(data, Transacao.DEPOSITO, valor));
            return;
        }
        throw new RuntimeException("Saldo insuficiente");
    }
}