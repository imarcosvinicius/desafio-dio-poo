import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("Descrição curso Js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJim = new Dev();
        devJim.setNome("Jim Carrey");
        devJim.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Jim Carrey: " + devJim.getConteudosIncritos());
        devJim.progredir();
        devJim.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Jim Carrey: " + devJim.getConteudosIncritos());
        System.out.println("Conteúdos Concluídos Jim Carrey: " + devJim.getConteudosConcluidos());
        System.out.println("XP: " + devJim.calcularXp());

        System.out.println("-----------");

        Dev devMichael = new Dev();
        devMichael.setNome("Michael Jackson");
        devMichael.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Michael Jackson: " + devMichael.getConteudosIncritos());
        devMichael.progredir();
        devMichael.progredir();
        devMichael.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Michael Jackson: " + devMichael.getConteudosIncritos());
        System.out.println("Conteúdos Concluídos Michael Jackson: " + devMichael.getConteudosConcluidos());
        System.out.println("XP: " + devMichael.calcularXp());



    }
}
