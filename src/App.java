import dominio.banco.Banco;
import dominio.cliente.Cliente;
import dominio.conta.Conta;
import dominio.conta.Transacao;
import fabricas.ClienteFabrica;
import fabricas.ContaFabrica;
import infraestrutura.dbclientes.Cliente.ManipulaEmMemoria;
import infraestrutura.banco.NovoBanco;
import infraestrutura.conta.TransacoesBancarias;

public class App {
    public static void main(String[] args) throws Exception {

        Conta c1 = new ContaFabrica().criar(0, ContaFabrica.CP);
        Conta c2 = new ContaFabrica().criar(0, ContaFabrica.CC);

        Cliente cliente = ClienteFabrica.criar("Fulano", "123.456.789-01", "email@emil.com.br", 
            "32 98449 - 0985", "11111-111", "SP", "cidade", "bairro", "rua", "numero", "complemento",c1);

        Cliente cliente2 = ClienteFabrica.criar("Beltrano", "123.456.789-02", "abc@email.com.br", 
            "32 98449 - 0985", "11111-111", "SP", "cidade", "bairro", "rua", "numero", "complemento",c2);

        ManipulaEmMemoria clientes = new ManipulaEmMemoria();
        clientes.cadastrar(cliente);
        clientes.cadastrar(cliente2);

        Banco bancoABC = (new NovoBanco()).gerarNovoBanco("Banco ABC", "123.456.789-01");

        bancoABC.setConta(c1);
        bancoABC.setConta(c2);


        TransacoesBancarias transacoes = new TransacoesBancarias();
        transacoes.depositar(cliente.getConta(), 100, "26/01/2022");
        transacoes.depositar(cliente.getConta(), 100, "26/01/2022");
        transacoes.depositar(cliente.getConta(), 100, "26/01/2022");
        transacoes.depositar(cliente.getConta(), 100, "26/01/2022");

        System.out.println("Saldo do "+ cliente.getNome()+ cliente.getConta().getSaldo());

        transacoes.sacar(cliente.getConta(), 50, "26/01/2022");

        System.out.println("Saldo do "+ cliente.getNome()+ cliente.getConta().getSaldo());

        transacoes.transferir(cliente.getConta(), cliente2.getConta(), 50, "26/01/2022");

        System.out.println("Saldo do "+ cliente.getNome()+ cliente.getConta().getSaldo());

        System.out.println("Extrato do "+ cliente.getNome());
        for (Transacao transacao : cliente.getConta().getTransacoes()) {
            System.out.println(transacao.getData() + " " + transacao.getTipo() + " " + transacao.getValor());
        }
        
        System.out.println("Saldo do "+ cliente2.getNome()+ cliente2.getConta().getSaldo());

        System.out.println("Listando todas as contas do banco");
        for (Conta conta : bancoABC.getContas()) {
            System.out.println(conta.getAgencia()+" "+conta.getNumero()+" "+conta.getSaldo());
        }

    }
}
