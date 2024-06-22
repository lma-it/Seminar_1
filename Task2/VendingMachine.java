package Task2;
import java.util.List;

import Task2.impl.HotDrink;

import java.util.ArrayList;

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

        for (Product product : products) {
            if(product.getName().equals(name)){
                Product result = product;
                products.remove(product);
                return result;
            }
        }
        System.out.println("Продукта " + name + " нет в торговом аппарате");
        return null;
    }

    public Product getProduct(String name, float volume, float temperature) {

        for (Product product : products) {
            if(product.getName().equals(name)){
                if(product.equals(HotDrink.class)){
                    HotDrink result = (HotDrink) product;
                    if(result.getVolume() == volume && result.getTemperature() == temperature){
                        products.remove(product);
                        return result;
                    }
                }
            }
        }
        System.out.println("Напитка " + name + " нет в аппарате.");
        return null;
    }

    public void setProduct(Product product) {
        this.products.add(product);
    }

    public void initProducts(List<Product> products){
        this.products.addAll(products);
    }

}
