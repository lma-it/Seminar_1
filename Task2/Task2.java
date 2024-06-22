package Task2;
import static print_module.print_library.println;

import Task2.impl.BottleOfWater;
import Task2.impl.HotDrink;
import Task2.impl.HotDrinkVendingMachine;
import Task2.impl.Materials;
import Task2.impl.WaterVendingMachine;
import java.util.List;

import java.time.LocalDate;

public class Task2 {
    public static void main(String[] args) {
        println("Hello");

        Product bottle = new BottleOfWater("Родники Гозированные", 
                                            55, 
                                            LocalDate.of(2024, 05, 01), 
                                            0.5f, 
                                            Materials.GLASS,
                                            true);

        Product bottle2 = new BottleOfWater("Zam-Zam", 
                                            75, 
                                            LocalDate.of(2024, 05, 01));


        println(bottle.getInfo());
        println(bottle2.getInfo());

        VendingMachine vendingMachine = new WaterVendingMachine();
        println(vendingMachine.getProducts());
        vendingMachine.initProducts(List.of(bottle, bottle, bottle, bottle2, bottle2, bottle2, bottle));
        println("В нашем автомате имеются следующая продукция: " + vendingMachine.getProducts());
        println("Благодарим за покупку: " + vendingMachine.getProduct("Zam-Zam"));
        println("В нашем автомате имеются следующая продукция: " + vendingMachine.getProducts());

        Product cappuccino = new HotDrink("Cappuccino",
                                        1.4f,
                                        LocalDate.now(),
                                        0.3f,
                                        70.0f);

        Product latte = new HotDrink("Latte",
                                        1.5f,
                                        LocalDate.now(),
                                        0.3f,
                                        73.0f);

        Product americano = new HotDrink("Americano",
                                        1.3f,
                                        LocalDate.now(),
                                        0.3f,
                                        73.0f);

        VendingMachine coffeeMachine = new HotDrinkVendingMachine();
        println(coffeeMachine.getProducts());
        coffeeMachine.initProducts(List.of(cappuccino, latte, latte, americano, cappuccino, latte));
        println(coffeeMachine.getProducts());

    }

}
