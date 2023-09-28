import com.workintech.Products.Bread;
import com.workintech.Products.Chocolate;
import com.workintech.Products.Coke;
import com.workintech.Products.ProductForSale;

public class Store {
    public static void main(String[] args) {

        ProductForSale[] products = new ProductForSale[3];
        products[0] = new Chocolate("White Chocolate", "Much sugar", 20);
        products[1] = new Coke("Light Coke", "Zero sugar", 25);
        products[2] = new Bread("Brown bread", "Healthy", 15);
        listProducts(products);


    }


    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
        }
    }





}