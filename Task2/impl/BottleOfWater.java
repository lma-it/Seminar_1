package Task2.impl;

import java.time.LocalDate;

import Task2.Product;

public class BottleOfWater extends Product{

    private float volume;
    private Materials material;
    private boolean isSparky;

    public BottleOfWater(String name, float price, LocalDate manufactureDate, float volume, Materials material, boolean isSparky) {
        super(name, price, manufactureDate);
        this.volume = volume;
        this.material = material;
        this.isSparky = isSparky;
    }
    
    public BottleOfWater(String name, float price, LocalDate manufactureDate) {
        super(name, price, manufactureDate);
    }

    public float getVolume() {
        return this.volume;
    }

    public Materials getMaterial() {
        return this.material;
    }

    public boolean IsSparky() {
        return this.isSparky;
    }

    @Override
    public String getInfo() {
        return String.format("Volume: %s, Material: %s, isSparky: %s", this.getVolume(), this.getMaterial(), this.IsSparky());
    }

    @Override
    public String toString() {
        return String.format("%s, %s",super.toString(), this.getInfo());
    }

}
