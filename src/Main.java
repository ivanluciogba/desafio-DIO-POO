import br.com.desafio.dio.dominio.*;

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




        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome(" Bootcamp java developer");
        bootcamp.setDescricao("Descrição bootcamp java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devIvan = new Dev();
        devIvan.setNome("Ivan");
        devIvan.inscreverBootcamp(bootcamp);
        devIvan.progredir();
        System.out.println("-");

        System.out.println("conteudos inscritos Ivan"+ devIvan.getConteudosInscritos());
        System.out.println("conteudos concluidos Ivan"+ devIvan.getConteudosConcluidos());
        System.out.println(" XP: " + devIvan.calcularXp());

        System.out.println("-*-*-*-");

        Dev devSislan = new Dev();
        devSislan.setNome("Sislan");
        devSislan.inscreverBootcamp(bootcamp);
        devSislan.progredir();
        devSislan.progredir();


        System.out.println("-");

        System.out.println("conteudos inscritos Sislan "+ devSislan.getConteudosInscritos());
        System.out.println("conteudos concluidos Sislan"+ devSislan.getConteudosConcluidos());
        System.out.println(" XP: " + devSislan.calcularXp());



    }
}
