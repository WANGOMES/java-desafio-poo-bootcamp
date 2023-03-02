import java.time.LocalDate;

import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

public class App {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("descrição curso Java");
        curso1.setCargaHoraria(8);

        curso2.setTitulo("JS");
        curso2.setDescricao("descrição curso JS");
        curso2.setCargaHoraria(5);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setDescricao("descrição mentoria Java");
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev dev1 = new Dev();
        dev1.setNome("Carlos Drummond de Andrade");
        System.out.println("\nDev Carlos Drummond de Andrade --- \nTotal XP: " + dev1.calcularTotalXp());
        dev1.inscreverBootcamp(bootcamp);
        dev1.progredir();
        dev1.progredir();
        dev1.progredir();
        System.out.println(dev1);
        System.out.println("Total XP: " + dev1.calcularTotalXp());

        Dev dev2 = new Dev();
        dev2.setNome("Mario Quintana");
        System.out.println("\nDev Mario Quintana --- \nTotal XP: " + dev2.calcularTotalXp());
        dev2.inscreverBootcamp(bootcamp);
        dev2.progredir();
        System.out.println(dev2);
        System.out.println("Total XP: " + dev2.calcularTotalXp());

        System.out.println("\n\nDados sobre o Bootcamp: " + bootcamp);

    }
}
