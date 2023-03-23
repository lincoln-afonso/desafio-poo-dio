import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import br.com.dio.desafio.dominio.Bootcamp;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java Basico");
        curso1.setDescricao("Curso elaborado com base na linguagem java");
        curso1.setCargaHoraria(5);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso HTML5 e CSS3");
        curso2.setDescricao("Curso front-end basico");
        curso2.setCargaHoraria(5);

        System.out.println("Curso 1: " + curso1);
        System.out.println("Curso 2: " + curso2 + "\n");

        /*
         * //POLIMORFISMO (CRIANDO UM CURSO A PARTIR DA CLASSE CONTEUDO) Conteudo
         * conteudo1 = new Curso(); Conteudo conteudo2 = new Mentoria();
         */

        ///
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria java");
        mentoria.setDescricao("java");
        mentoria.setData(LocalDate.now());

        System.out.println("Mentoria: " + mentoria + "\n");

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java developer");
        bootcamp.setDescricao("Bootcamp Java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devLincoln = new Dev();
        devLincoln.setNome("Lincoln");
        devLincoln.inscreverBootCamp(bootcamp);
        System.out.println("Conteudo inscritos Lincoln: " + devLincoln.getConteudoInscritos() + "\n");
        System.out.println("Conteudo concluídos Lincoln: " + devLincoln.getConteudoConcluidos() + "\n");
        devLincoln.progredir();
        devLincoln.progredir();
        System.out.println("XP: " + devLincoln.calcularTotalXp());

        System.out.println("");

        Dev devJose = new Dev();
        devJose.setNome("Jose");
        devJose.inscreverBootCamp(bootcamp);
        System.out.println("Conteudo inscritos João: " + devJose.getConteudoInscritos() + "\n");
        devJose.progredir();
        devJose.progredir();
        devJose.progredir();
        System.out.println("Conteudo inscritos João: " + devJose.getConteudoInscritos() + "\n");
        System.out.println("Conteudo concluídos João: " + devJose.getConteudoConcluidos() + "\n");
        System.out.println("XP: " + devJose.calcularTotalXp());
    }
}