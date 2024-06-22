package Task2;
import java.util.List;

import Task2.impl.HotDrink;

import java.util.ArrayList;
import java.util.Iterator;

public class VendingMachine {
    protected List<Product> products = new ArrayList<>();

    public VendingMachine(){
        this.products = new ArrayList<>();
    }

    public VendingMachine(List<Product> products){
        this.products = products;
    }

    public List<Product> getProducts(){
        return this.products;
    }

    public Product getProduct(String name){

        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product.getName().equals(name)) {
                iterator.remove();
                return product;
            }
        }
        System.out.println("Продукта " + name + " нет в торговом аппарате");
        return null;
    }

    public Product getProduct(String name, float volume, float temperature) {

        HotDrink result = products.stream()
            .filter(product -> product.getName().equals(name))
            .filter(product -> product instanceof HotDrink)
            .map(product -> (HotDrink) product)
            .filter(hotDrink -> hotDrink.getVolume() == volume && hotDrink.getTemperature() == temperature)
            .findFirst()
            .orElse(null);

        if (result != null) {
            products.remove(result);
            return result;
        }
        System.out.println("Напитка " + name + " нет в торговом аппарате.");
        return null;
    }

    public void setProduct(Product product) {
        this.products.add(product);
    }

    public void initProducts(List<Product> products){
        this.products.addAll(products);
    }

}
