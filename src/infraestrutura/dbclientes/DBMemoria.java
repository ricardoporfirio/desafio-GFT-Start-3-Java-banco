package infraestrutura.dbclientes;

import java.util.ArrayList;

import dominio.cliente.Cliente;

public abstract class DBMemoria {
    private static ArrayList<Cliente> clientes;

    public DBMemoria() {
        clientes = new ArrayList<Cliente>();
    }

    public static ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public static void setClientes(Cliente cliente) {
        clientes.add(cliente);
    }

}
