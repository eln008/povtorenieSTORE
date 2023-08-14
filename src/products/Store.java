package products;

public class Store {
    private Product[] products;

    public void doInspection(){
        int i = 1;
        System.out.println("======================= Inspection result =======================\n " +
                             "Product     | Produced On | Storage place | life days | Fresh" + "\n"+
                           "-----------+---------------+---------------+--------------+------------+");
        for (Product p :this.products) {
            System.out.printf("%d. |%s          | %s        | %s        | %d       | %s\n",
                    i,
                    p.getProductName(),
                    p.getProducedOn(),
                    p.getPlaceOfProduct(),
                    p.getExpDay(),
                    p.getIsFresh());
            i++;
        }
    }


    public void setProducts(Product[] products) {
        this.products = products;
    }
}
