package com.javaVsCode.project01;

import java.util.ArrayList;
import java.util.List;

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

        //Imperative Approach
        List<Person> females = new ArrayList<>();

        for (Person person:people){
            if(FEMALE.equals(person.gender)){
                females.add(person);
            }
        }

        for (Person female:females){
            System.out.println( female );
        }        
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
