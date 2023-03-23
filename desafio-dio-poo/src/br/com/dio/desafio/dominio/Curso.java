package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {
    private int cargaHoraria;

    public Curso() {
    }

    public Curso(String titulo, String descricao, int cargaHoraria) {
        super(titulo, descricao);
        this.cargaHoraria = cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double calcularXp() {
        return this.getXpPadrao() * this.getCargaHoraria();
    }

    @Override
    public String toString() {
        return "Curso [cargaHoraria=" + this.cargaHoraria + ", descricao=" + this.getDescricao() + ", titulo="
                + this.getTitulo() + "]";
    }
}
