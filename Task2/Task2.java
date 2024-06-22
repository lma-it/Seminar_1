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
        println("В нашем автомате имеются следующая продукция напитков: " + vendingMachine.getProducts());
        vendingMachine.initProducts(List.of(bottle, bottle, bottle, bottle2, bottle2, bottle2, bottle));
        println("В нашем автомате имеются следующая продукция напитков: " + vendingMachine.getProducts());
        println();
        println("Благодарим за покупку напитка: " + vendingMachine.getProduct("Zam-Zam"));
        println();
        println("В нашем автомате имеются следующая продукция напитков: " + vendingMachine.getProducts());
        println();

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
        println("В нашем автомате имеются следующая продукция кофе: " + coffeeMachine.getProducts());
        coffeeMachine.initProducts(List.of(cappuccino, latte, latte, americano, cappuccino, latte));
        println("В нашем автомате имеются следующая продукция кофе: " + coffeeMachine.getProducts());
        println();
        println("Спасибо за покупку кофе " + coffeeMachine.getProduct("Latte", 0.3f, 73.0f));
        println();
        println("В нашем автомате имеются следующая продукция кофе: " + coffeeMachine.getProducts());
        println();
        println("Добавляем чаи и аппарат по приготовлению и продаже чаев.");

        Product greenTea = new HotDrink("Ahmad", 
                                        60f, 
                                        LocalDate.now(), 
                                        0.33f, 
                                        90.0f);

        Product greenTea2 = new HotDrink("Пуэр", 
                                        140f, 
                                        LocalDate.now(), 
                                        0.33f, 
                                        90.0f);

        Product greenTea3 = new HotDrink("Тигуань-Инь", 
                                        120f, 
                                        LocalDate.now(), 
                                        0.33f, 
                                        90.0f);

        Product blackTea = new HotDrink("Lipton", 
                                        80f, 
                                        LocalDate.now(), 
                                        0.33f, 
                                        90.0f);

        Product blackTea2 = new HotDrink("Dilmah", 
                                        70f, 
                                        LocalDate.now(), 
                                        0.33f, 
                                        90.0f);

        Product blackTea3 = new HotDrink("GreenField", 
                                        75f, 
                                        LocalDate.now(), 
                                        0.33f, 
                                        90.0f);

        VendingMachine teaMachine = new HotDrinkVendingMachine();

        teaMachine.initProducts(List.of(greenTea, greenTea2, blackTea, blackTea3, greenTea3, blackTea2));
        println("В нашем автомате имеются следующая продукция чая: " + teaMachine.getProducts());
        println();
        println("Спасибо за покупку чая " + teaMachine.getProduct("Ahmad", 0.33f, 90.0f));
        println();
        println("В нашем автомате имеются следующая продукция чая: " + teaMachine.getProducts());
        println();



    }

}
