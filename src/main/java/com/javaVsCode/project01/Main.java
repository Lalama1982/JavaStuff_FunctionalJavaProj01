package com.javaVsCode.project01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class Main {
    public static void main( String[] args )
    {
        System.out.println( "At FunctionalJavaProject01" );
        Gender MALE = Gender.MALE;
        Gender FEMALE = Gender.FEMALE;
        List<Person> people = new ArrayList<Person>();
        people.add(new Person("John",MALE));
        people.add(new Person("Maria",FEMALE));
        people.add(new Person("Aisha",FEMALE));
        people.add(new Person("Alex",MALE));
        people.add(new Person("Alice",FEMALE));

        System.out.println("\n>> Imperative Approach");
        List<Person> females = new ArrayList<>();

        // Selecting "FEMALES", and adding
        for (Person person:people){
            if(FEMALE.equals(person.gender)){
                females.add(person);
            }
        }

        // Displaying FEMALE records..
        for (Person female:females){
            System.out.println( female );
        }        

        System.out.println("\n>> Declarative Approach");
        System.out.println("    >>  Option:1");    
        people.stream()
            .filter(person -> FEMALE.equals(person.gender)) // "Lambada" notations
            .collect(Collectors.toList())
            .forEach(System.out::println);

        System.out.println("\n    >>  Option:2");    
        List<Person> females2 = people.stream()
            .filter(person -> FEMALE.equals(person.gender))   
            .collect(Collectors.toList());
            females2.forEach(System.out::println);

    }

    static class Person {
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        public String toString(){
            return "Person{"+"name='"+name+'\''+", gender="+gender+'}';
        }
    }

    enum Gender {
        MALE, FEMALE
    }
}
