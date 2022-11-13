package Biblioteca;

import java.time.LocalDate;

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
}
