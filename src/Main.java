import desafio.dominio.Bootcamp;
import desafio.dominio.Curso;
import desafio.dominio.Dev;
import desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java Developer");
        bootcamp.setDescricao("Descricao java");
        bootcamp.getCounteudos().add(curso1);
        bootcamp.getCounteudos().add(curso2);
        bootcamp.getCounteudos().add(mentoria);

        Dev devLucas = new Dev();
        devLucas.setNome("Lucas");
        devLucas.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos " + devLucas.getConteudosInscritos());
        devLucas.progredir();
        devLucas.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos " + devLucas.getConteudosInscritos());
        System.out.println("Conteudos Concluidos " + devLucas.getConteudosConcluidos());
        System.out.println("XP:" + devLucas.calcularXp());

        System.out.println("--------");

        Dev devJose = new Dev();
        devJose.setNome("Jose");
        devJose.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos " + devJose.getConteudosInscritos());
        devJose.progredir();
        devJose.progredir();
        devJose.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos " + devJose.getConteudosInscritos());
        System.out.println("Conteudos Concluidos " + devJose.getConteudosConcluidos());
        System.out.println("XP:" + devJose.calcularXp());

    }
}