package Task2.impl;

import java.time.LocalDate;

import Task2.Product;

public class HotDrink extends Product{

    private float volume;
    private float temperature;


    public HotDrink(String name, float price, LocalDate manufactureDate, float volume, float temperature) {
        super(name, price, manufactureDate);
        this.volume = volume;
        this.temperature = temperature;
    }

    public float getVolume() {
        return volume;
    }

    public float getTemperature() {
        return temperature;
    }

    @Override
    public String getInfo() {
        return String.format("Volume: %s, Temperature: %s", this.getVolume(), this.getTemperature());
    }

    @Override
    public String toString() {
        return String.format("%s, %s",super.toString(), this.getInfo());
    }

    
}
