package dominio.cliente;

import dominio.conta.Conta;

public class Cliente {
    
    private String nome;
    private Cpf cpf;
    private Email email;
    private String telefone;
    private Endereco endereco;
    private Conta conta;

    public Cliente(String nome, Cpf cpf, Email email, String telefone, Endereco endereco,Conta conta) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        this.conta = conta;
    }

    public String getNome() {
        return nome;
    }

    public Cpf getCpf() {
        return cpf;
    }

    public Email getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public Conta getConta() {
        return conta;
    }

}
