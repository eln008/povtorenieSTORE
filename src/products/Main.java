package products;

import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Product[] products = new Product[]{
                new Milk("Milk",60),
                new Milk ("Milk",60),
                new Milk ("Milk",60),
                new Milk ("Milk",60),

                new Corn ("Corn",150),
                new Corn ("Corn",150),
                new Corn ("Corn",150),
                new Corn ("Corn",150),
                new Corn ("Corn",150),

                new Salt  ("Salt",0),
                new Salt  ("Salt",0),
                new Salt  ("Salt",0),
                new Salt  ("Salt",0),
                new Salt  ("Salt",0),

                new Stew  ("Stew",180),
                new Stew  ("Stew",180),
                new Stew  ("Stew",180),
                new Stew  ("Stew",180),
                new Stew  ("Stew",180),

                new Fish  ("Fish",20),
        };
        Random random = new Random();
        for (int i = products.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            Product temp = products[i];
            products[i] = products[j];
            products[j] = temp;
        }
        Store store = new Store();
        store.setProducts(products);
        store.doInspection();

    }
}