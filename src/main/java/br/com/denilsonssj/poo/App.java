package br.com.denilsonssj.poo;

import java.time.LocalDate;

import br.com.denilsonssj.poo.application.domain.Bootcamp;
import br.com.denilsonssj.poo.application.domain.Course;
import br.com.denilsonssj.poo.application.domain.Developer;
import br.com.denilsonssj.poo.application.domain.Mentoring;

public class App {

    public static void main( String[] args ) {
        Course courseOne = new Course();
        courseOne.setTitle("Javascript Course");
        courseOne.setDescription("Javascript Course Description");
        courseOne.setWorkload(8);

        Course courseTwo = new Course();
        courseTwo.setTitle("Basic Java Course");
        courseTwo.setDescription("Basic Java Course Description");
        courseTwo.setWorkload(4);

        Mentoring mentoring = new Mentoring();
        mentoring.setTitle("Java Mentoring");
        mentoring.setDescription("Java Mentoring Description");
        mentoring.setDate(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp Java Developer");
        bootcamp.setDescription("Description Bootcamp Java Developer");
        bootcamp.getContents().add(courseOne);
        bootcamp.getContents().add(courseTwo);
        bootcamp.getContents().add(mentoring);

        Developer developerOne = new Developer();
        developerOne.setName("Camilla Shawn");
        developerOne.subscribeBootcamp(bootcamp);
        System.out.println("All");
        System.out.println(developerOne.getSubscriptions());
        developerOne.levelUp();
        System.out.println(developerOne.getSubscriptions());
        System.out.println(developerOne.getCompletedSubscriptions());
        System.out.println("Total XP " + developerOne.calculateTotalXp());

        Developer developerTwo = new Developer();
        developerTwo.setName("Johnathan Kujo");
        developerTwo.subscribeBootcamp(bootcamp);
        developerTwo.levelUp();
        developerTwo.levelUp();
        developerTwo.levelUp();
        System.out.println(developerTwo.getSubscriptions());
        System.out.println(developerTwo.getCompletedSubscriptions());
        System.out.println("Total XP " + developerTwo.calculateTotalXp());


        
    }

}
