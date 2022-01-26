package dominio.cliente;

public class Endereco {
    private String cep;
    private String estado;
    private String cidade;
    private String bairro;
    private String rua;
    private String numero;
    private String complemento;

    public Endereco(String cep, String estado, String cidade, String bairro, String rua, String numero, String complemento) {
        this.cep = cep;
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
    }

    // getters
    public String getCep() {
        return cep;
    }

    public String getEstado() {
        return estado;
    }

    public String getCidade() {
        return cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public String getRua() {
        return rua;
    }

    public String getNumero() {
        return numero;
    }

    public String getComplemento() {
        return complemento;
    }

    // setters
    public Endereco setCep(String cep) {
        this.cep = cep;
        return this;
    }

    public Endereco setEstado(String estado) {
        this.estado = estado;
        return this;
    }

    public Endereco setCidade(String cidade) {
        this.cidade = cidade;
        return this;
    }

    public Endereco setBairro(String bairro) {
        this.bairro = bairro;
        return this;
    }

    public Endereco setRua(String rua) {
        this.rua = rua;
        return this;
    }

    public Endereco setNumero(String numero) {
        this.numero = numero;
        return this;
    }

    public Endereco setComplemento(String complemento) {
        this.complemento = complemento;
        return this;
    }

}
