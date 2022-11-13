package Biblioteca;

public class Endereco {
    private String logradouro;
    private String bairro;
    private String cidade;
    private String uf;
    private int numero;
    public Endereco(String logradouro, String bairro, String cidade, String uf, int numero) {
        this.logradouro = logradouro  ;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf; 
        this.numero = numero;
    }
    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }    
}