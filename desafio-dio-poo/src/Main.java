import br.com.dio.desafio.br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java Basico");
        curso1.setDescricao("Curso elaborado com base na linguagem java");
        curso1.setCargaHoraria(45);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso HTML5 e CSS3");
        curso1.setDescricao("Curso front-end basico");
        curso1.setCargaHoraria(45);

        System.out.println(curso1);
        System.out.println(curso2);

        /* //POLIMORFISMO (CRIANDO UM CURSO A PARTIR DA CLASSE CONTEUDO)
         * Conteudo conteudo1 = new Curso();
         * Conteudo conteudo2 = new Mentoria();
         */


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria java");
        mentoria.setDescricao("java");
        mentoria.setData(LocalDate.now());

        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java developer");
        bootcamp.setDescricao("Bootcamp Java developer");
        bootcamp.getConteudo().add(curso1);
        bootcamp.getConteudo().add(curso2);
        bootcamp.getConteudo().add(mentoria);

        Dev devLincoln = new Dev();
        devLincoln.setNome("Lincoln");
        devLincoln.inscreverBootcamp(bootcamp);
        System.out.println("Conteudo inscritos: " + devLincoln.getConteudosInscritos());
        devLincoln.progredir();
        devLincoln.progredir();
        System.out.println("Conteudo inscritos: " + devLincoln.getConteudosInscritos());
        System.out.println("Conteudo concluídos: " + devLincoln.getConteudosConcluidos());
        System.out.println("XP: " + devLincoln.calcularTotalXp());

        System.out.println("");

        Dev devJose = new Dev();
        devJose.setNome("Jose");
        devJose.inscreverBootcamp(bootcamp);
        System.out.println("Conteudo inscritos: " + devJose.getConteudosInscritos());
        jose.progredir();
        System.out.println("Conteudo inscritos: " + devJose.getConteudosInscritos());
        System.out.println("Conteudo concluídos: " + devJose.getConteudosConcluidos());
        System.out.println("XP: " + devLincoln.calcularTotalXp());
    }
}