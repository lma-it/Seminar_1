package Task2;
import static print_module.print_library.println;

import Task2.impl.BottleOfWater;
import Task2.impl.Materials;
import Task2.impl.WaterVendingMachine;
import java.util.List;

import java.time.LocalDate;

public class Task2 {
    public static void main(String[] args) {
        println("Hello");

        Product bottle = new BottleOfWater("Родники", 
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
        println(vendingMachine.getProducts());

    }

}
