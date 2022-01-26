package fabricas;

import dominio.cliente.Cpf;
import dominio.cliente.Email;
import dominio.cliente.Endereco;
import dominio.conta.Conta;
import dominio.cliente.Cliente;

public class ClienteFabrica {

    public static Cliente criar(String nome, String cpf, String email, 
                  String telefone, String cep,String estado, String cidade, String bairro, String rua, String numero, String complemento,Conta conta) {
        
                    Cpf cpfobj = new Cpf(cpf);
                    Email emailobj = new Email(email);
                    Endereco enderecoobj = new Endereco(cep, estado, cidade, bairro, rua, numero, complemento);  
                    return new Cliente(nome, cpfobj, emailobj, telefone, enderecoobj,conta);
    }

}
