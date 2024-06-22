package Task2;
import java.time.LocalDate;
import java.util.Objects;

public class Product {
    private String name;
    private float price;
    private LocalDate manufactureDate;

    public Product(String name, float price, LocalDate manufactureDate) {
        this.name = name;
        this.price = price;
        this.manufactureDate = manufactureDate;
    }

    public String getName() {
        return this.name;
    }

    public float getPrice() {
        return this.price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public LocalDate getManufactureDate() {
        return this.manufactureDate;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Product)) {
            return false;
        }
        Product product = (Product) o;
        return Objects.equals(name, product.name) && price == product.price && Objects.equals(manufactureDate, product.manufactureDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, manufactureDate);
    }

    @Override
    public String toString() {
        return "Name: '" + getName() + "'" +
            ", Price: '" + getPrice() + "'" +
            ", manufactureDate: '" + getManufactureDate();
    }

    public String getInfo(){
        return String.format("%s, ", super.toString());
    }
    

}
