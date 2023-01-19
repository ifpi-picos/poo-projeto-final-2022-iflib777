package Biblioteca;

import java.time.LocalDate;
import java.util.Set;

public class Livro {
    private String titulo;
    private String autor;
    private String areaConhecimento;
    private LocalDate dataPublicacao;
    private int quantidadeLivros;

    public Livro(String titulo, String autor, String areaConhecimento, LocalDate dataPublicacao, int quantidadeLivros) {
        this.titulo = titulo;
        this.autor = autor;
        this.areaConhecimento = areaConhecimento;
        this.dataPublicacao = dataPublicacao;
        this.quantidadeLivros = quantidadeLivros;
    }

    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAreaConhecimento() {
        return areaConhecimento;
    }

    public void setAreaConhecimento(String areaConhecimento) {
        this.areaConhecimento = areaConhecimento;
    }

    public LocalDate getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(LocalDate dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }
    
    public int getQuantidadeLivros() {
        return quantidadeLivros;
    }

    public void setQuantidadeLivros(int quantidadeLivros) {
        this.quantidadeLivros = quantidadeLivros;
    }
}
