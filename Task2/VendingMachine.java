package Task2;
import java.util.List;
import java.util.ArrayList;

public class VendingMachine {
    private List<Product> products = new ArrayList<>();

    public List<Product> getProducts(){
        return this.products;
    }

    public Product getProduct(Product product){
        if (this.products.contains(product)){
            Product result = product;
            this.products.remove(product);
            return result;
        }else{
            System.out.println("Такого продукта нет в списке");
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
