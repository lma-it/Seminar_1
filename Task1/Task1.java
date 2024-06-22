package Task1;
import static print_module.print_library.println;

import java.time.LocalDate;
import java.util.List;

/**
 * Task1
 */
public class Task1 {

    public static void main(String[] args) {
        println("Hello");

        // ИНКАПСУЛЯЦИЯ И НАСЛЕДОВАНИЕ
        Cat cat = new Cat("Barsik", LocalDate.now(), new Owner("Friend"));
        println(cat.getInfo());

        Animal animal = new Animal("Animal_1", LocalDate.now());
        println(animal);

        println(cat.getName());
        cat.setName("Tom");
        println(cat.getName());
        println(cat);
        println(cat.getType());
        println(animal.getType());

        Dog doggy = new Dog("Lada", LocalDate.now(), new Owner("Bill"));
        println(doggy.getInfo());
        println(doggy.getType());

        // ПОЛИМОРФИЗМ
        Animal animalCat = new Cat("Lulu", LocalDate.now(), new Owner("I'm"));
        println(animalCat.getInfo());

        List<Animal> clinicAnimals = List.of(cat, doggy, animalCat, animal);
        println(clinicAnimals);
    }
}