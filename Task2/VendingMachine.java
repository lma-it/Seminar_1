package Task2;
import java.util.List;
import java.util.ArrayList;

public class VendingMachine {
    private List<Product> products = new ArrayList<>();

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
            }else{
                System.out.println("Продукта " + product.getName() + " нет в торговом аппарате");
            }
        }
        return null;
    }

    public void setProduct(Product product) {
        this.products.add(product);
    }

    public void initProducts(List<Product> products){
        this.products.addAll(products);
    }

}
