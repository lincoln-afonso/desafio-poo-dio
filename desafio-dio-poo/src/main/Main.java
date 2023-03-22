package main;

import br.com.dio.desafio.dominio.Curso;

public class Main {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Curso basico java");
        curso1.setCargaHoraria("35");

        System.out.println(curso1);
        System.out.println();
    }
}