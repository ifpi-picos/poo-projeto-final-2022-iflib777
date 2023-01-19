package Biblioteca;

public class Endereco {
    private String bairro;
    private String cidade;
    private String uf;
    private String rua;
    private int numero;

    public Endereco(String bairro, String cidade, String uf, String rua, int numero) {
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.rua = rua;
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

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }
}