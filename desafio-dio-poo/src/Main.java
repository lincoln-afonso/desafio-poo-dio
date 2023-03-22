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

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria java");
        mentoria1.setDescricao("java");
        mentoria1.setData(LocalDate.new());

        System.out.println(mentoria1);
    }
}