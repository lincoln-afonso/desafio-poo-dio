package br.com.dio.desafio.dominio;

public class Mentoria {
    private String titulo;
    private String descricao;
    private LocalDate data;

    public Mentoria() {
    }

    public Mentoria(String titulo, String descricao, LocalDate data) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.data = data;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
	public String toString() {
		return "Mentoria [titulo=" + titulo + ", descricao=" + descricao + ", data=" + data + "]";
	}
}
