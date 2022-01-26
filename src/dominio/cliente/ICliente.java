package dominio.cliente;

import java.util.ArrayList;

public interface ICliente {

    public void cadastrar(Cliente cliente);

    public ArrayList<Cliente> Listar();

}
