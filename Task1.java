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

        Animal animal = new Animal("Anumal_1", LocalDate.now());
        println(animal.getInfo());

        println(cat.getName());
        cat.setName("Tom");
        println(cat.getName());
        
    }
}