package dominio.conta;

public class Transacao {
    public static final int SAQUE = 1;
    public static final int DEPOSITO = 2;
    public static final int TRANSFERENCIA = 3;
    
    private String data;
    private int tipo;
    private double valor;

    public Transacao(String data, int tipo, double valor) {
        this.data = data;
        this.tipo = tipo;
        this.valor = valor;
    }

    public String getData() {
        return this.data;
    }

    public String getTipo() {
        String transacao = "";
        switch (this.tipo) {
            case SAQUE:
                transacao = "Saque";
                break;
            case DEPOSITO:
                transacao = "Depósito";
                break;
            case TRANSFERENCIA:
                transacao = "Transferência";
                break;
        }
        return transacao;
    }

    public double getValor() {
        return this.valor;
    }    

}
