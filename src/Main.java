import br.com.desafio.dio.dominio.Curso;
import br.com.desafio.dio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();

        curso1.setTitulo("Curso java");
        curso1.setDescricao(" Descrição curso em java");
        curso1.setCargahoraria(8);

        Curso curso2 = new Curso();

        curso2.setTitulo("Curso java 2");
        curso2.setDescricao(" Descrição curso em js");
        curso2.setCargahoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

    }
}
