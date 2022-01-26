package infraestrutura.banco;

import java.util.ArrayList;

import dominio.banco.Banco;
import dominio.banco.IBanco;
import dominio.conta.Conta;

public class NovoBanco implements IBanco {
    private Banco banco;

    public Banco gerarNovoBanco(String nome, String cnpj) {
        this.banco = new Banco(nome, cnpj);

        return this.banco;
    }

    public ArrayList<Conta> getContas() {
        return this.banco.getContas();
    }
    
}
