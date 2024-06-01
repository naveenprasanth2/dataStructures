package org.example.practise;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class ComplexStreamExample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice", 30),
                new Person("Bob", 25),
                new Person("Charlie", 35),
                new Person("Anna", 40)
        );
        System.out.println(averageAgeOfNameStartingWith(people, 'A'));
    }

    public static OptionalDouble averageAgeOfNameStartingWith(List<Person> people, char letter) {
        return people.stream().filter(x -> x.name().startsWith(String.valueOf(letter)))
                .mapToDouble(Person::age).average();
    }
}