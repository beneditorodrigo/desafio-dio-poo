import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso =  new Curso();
        curso.setTitulo("Curso Java DIO");
        curso.setDescricao("Curso Java 11 da Dio");
        curso.setCargaHoraria(36);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Java Spring Boot");
        curso2.setDescricao("Spring Boot, JPA, Hibernate utilizando Java");
        curso2.setCargaHoraria(60);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Mentoria Java 11 Dio");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Dio Java OrangeTech+");
        bootcamp.setDescricao("Descrição do Bootcamp Inter OrangeTech+");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devBenedito = new Dev();
        devBenedito.setNome("Benedito");
        devBenedito.inscreverBootcampo(bootcamp);
        System.out.println("Conteúdos Inscritos Benedito: " + devBenedito.getConteudosInscritos());
        devBenedito.progredir();
        System.out.println("Progrediu.....");
        System.out.println("Conteúdos Inscritos Benedito: " + devBenedito.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Benedito: " + devBenedito.getConteudosConcluidos());
        System.out.println("XP: " + devBenedito.calcularTotalXp());

        Dev devRodrigo = new Dev();
        devRodrigo.setNome("Rodrigo");
        devRodrigo.inscreverBootcampo(bootcamp);
        System.out.println("Conteúdos Inscritos Rodrigo: " + devRodrigo.getConteudosInscritos());
        devRodrigo.progredir();
        devRodrigo.progredir();
        devRodrigo.progredir();
        System.out.println("Progrediu.....");
        System.out.println("Conteúdos Inscritos Rodrigo: " + devRodrigo.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Rodrigo: " + devRodrigo.getConteudosConcluidos());
        System.out.println("XP: " + devRodrigo.calcularTotalXp());
    }
}
