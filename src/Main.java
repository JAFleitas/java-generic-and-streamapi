import GenericExercise.Utilities;
import StreamExercise.Person;
import StreamExercise.Programmer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        // ejercicio de genericos 1
        genericExerciseOne();
        genericExerciseTwo();



        /*
        // creo una lista
        List<Person> people = new ArrayList<>();
        people.add(new Person("Gonzalo", "28","Programar"));
        people.add(new Person("Luis", "33","Programar"));
        people.add(new Person("Julieta", "2","Mirar la Granja"));
        people.add(new Person("Micaela", "27","Escuchar musica"));
        people.add(new Person("Facundo", "23","Programar"));
        people.add(new Person("Thiago", "17","Leer"));

         ejercicios stream
         exampleOneStream(people);
         exampleTwoStream(people);
        */

    }

    private static void genericExerciseTwo() {

        // creo la lista para probar los metodos genericos
        List<String> names = new ArrayList<>();
        names.add("Gonzalo");
        names.add("Juli");
        names.add("Mica");
        List<Object> copyNames = new ArrayList<>();

        // copio la lista
        Utilities.copyList(names, copyNames);


        // imprimo la lista copiada
        Utilities.printElement(copyNames);

        /*
        Se deberia castear para transformarlo en un String
        String name = copyNames.get(0); X
        String name = (String) copyNames.get(0)
        */

    }

    private static void genericExerciseOne() {
        // creo la lista para probar los metodos genericos
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        List<Number> copyNumber = new ArrayList<>();

        // copio la lista
        Utilities.copyList(numbers, copyNumber);


        // imprimo la lista copiada
        Utilities.printElement(copyNumber);
    }

    private static void exampleTwoStream(List<Person> people) {
        List<Programmer> programmers = people.stream()
                .filter(p -> p.getHobby().contains("Programar"))
                .map(person -> new Programmer(person.getName(),"Java"))
                .skip(1)
                .limit(2)
                .toList();
        System.out.println(programmers.size());
        programmers.stream().forEach(programmer -> System.out.println(programmer.getName()));
    }

    private static void exampleOneStream(List<Person> people) {



        // creo una nueva lista usando Stream API
        List<Person> oldPeople = people.stream()
                .filter(person ->  Integer.parseInt(person.getAge()) >= 18)
                .filter(person -> person.getHobby().contains("Programar"))
                //.collect(Collectors.toList());
                .toList();
        // recorro la nueva lista
        for (Person person: oldPeople) {
            System.out.println(person.toString());
        }
        // creo un array de nombres
        String[] peopleName = people.stream()
                .map(Person::getName)
                .limit(5)
                .toArray(String[]::new);
        // imprimo el array usando forEach de Stream API
        Arrays.stream(peopleName).forEach(System.out::println);
        //System.out.println(Arrays.toString(peopleName));
    }
}