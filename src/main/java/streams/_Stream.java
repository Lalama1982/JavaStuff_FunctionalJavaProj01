package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class _Stream {
    public static void main(String[] args) {
        Gender MALE = Gender.MALE;
        Gender FEMALE = Gender.FEMALE;
        List<Person> people = new ArrayList<Person>();
        people.add(new Person("John", MALE));
        people.add(new Person("Maria", FEMALE));
        people.add(new Person("Aisha", FEMALE));
        people.add(new Person("Alex", MALE));
        people.add(new Person("Alex", FEMALE));
        people.add(new Person("Alice", FEMALE));

        // Map gender of each "person" object to a collection & display (unique set)
        System.out.println(">> \"Stream\" :: Map gender of each \"person\" object to a collection & display (unique set) <<");
        people.stream().map(person -> person.gender).collect(Collectors.toSet())
                .forEach(gender -> System.out.println("Unique Genders: " + gender));
        // Output:: MALE, FEMALE

        // Map gender of each "person" object to a collection & display (unique set)
        System.out.println("\n>> \"Stream\" :: Map gender of each \"person\" object to a collection & display (unique set) <<");
        people.stream().map(person -> person.name).collect(Collectors.toSet())
                .forEach(name -> System.out.println("Unique Names: " + name));
        // Output:: All the unique names

        // map each attribute of object of "people"
        System.out.println("\n>> \"Stream\" :: map each attribute of object of \"people\" <<");
        people.stream().map(person -> person)
                // .collect(col -> Collectors.toSet())
                // .mapToInt(String::length)
                .forEach(person -> System.out.println("Name: " + person.name + "  Length: " + person.name.length()));

        System.out.println("\n>> \"Stream\" :: mapToInt(length of the Name)<<");                
        people.stream().map(person -> person.name).mapToInt(String::length)
                .forEach(length -> System.out.println("Length of Each Name: " + length));

        System.out.println("\n>> \"Stream\" :: mapToInt(length of the Name); step breakdown<<");                                
        Function<Person, String> personStringFunction = person -> person.name;
        ToIntFunction<String> length = String::length; // converts length of each name (an int) to string
        IntConsumer println = x -> System.out.println(x); // OR System.out::println; print an int
        people.stream().map(personStringFunction).mapToInt(length).forEach(println);

    }

    static class Person {
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        public String toString() {
            return "Person{" + "name='" + name + '\'' + ", gender=" + gender + '}';
        }
    }

    enum Gender {
        MALE, FEMALE
    }
}