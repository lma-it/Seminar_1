package Task2.impl;

import java.time.LocalDate;

import Task2.Product;

public class BottleOfWater extends Product{

    private float volume;
    private Materials material;

    public BottleOfWater(String name, float price, LocalDate manufactureDate, float volume) {
        super(name, price, manufactureDate);
        this.volume = volume;
    }
    
}
