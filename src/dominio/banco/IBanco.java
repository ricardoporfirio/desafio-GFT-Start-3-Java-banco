package dominio.banco;

import java.util.ArrayList;
import dominio.conta.Conta;

public interface IBanco {
    
    public Banco gerarNovoBanco(String nome, String cnpj);
    public ArrayList<Conta> getContas();
}
