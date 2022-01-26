package infraestrutura.dbclientes.Cliente;

import dominio.cliente.Cliente;
import dominio.cliente.ICliente;
import infraestrutura.dbclientes.DBMemoria;
import java.util.ArrayList;


public class ManipulaEmMemoria extends DBMemoria implements ICliente{

    @Override
    public void cadastrar(Cliente cliente) {
        setClientes(cliente);
    }

    @Override
    public ArrayList<Cliente> Listar() {
        return getClientes();        
    }

    
}
