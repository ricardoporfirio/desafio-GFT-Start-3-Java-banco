package dominio.banco;

import java.util.ArrayList;
import dominio.conta.Conta;

public class Banco {

    private String nome;
    private String cnpj;
    private ArrayList<Conta> contas;

    public Banco(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.contas = new ArrayList<Conta>();
    }

    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public ArrayList<Conta> getContas() {
        return contas;
    }

    public Banco setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public Banco setCnpj(String cnpj) {
        this.cnpj = cnpj;
        return this;
    }

    public Banco setConta(Conta conta) {
        this.contas.add(conta);
        return this;
    }

}
