import static print_module.print_library.println;

import java.time.LocalDate;

/**
 * Task1
 */
public class Task1 {

    public static void main(String[] args) {
        println("Hello");

        // ИНКАПСУЛЯЦИЯ
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
    }
}