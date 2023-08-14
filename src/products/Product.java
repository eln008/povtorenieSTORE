package products;

import java.time.LocalDate;
import java.util.Random;

public class Product {
    private String  productName;
    private int expDay;
    private boolean isFresh;
    private LocalDate producedOn;
    private String placeOfProduct;

    private static Random random = new Random();

    public Product(String productName, int expDay) {
        this.productName = productName;
        this.expDay = expDay;
        generateDate();
        setPlace();
        isFresh();
    }

    public void isFresh (){
        int ex = 0;
        if (this.placeOfProduct.equals("Show-Case")){
            ex=this.expDay/2;
        }else {
            ex = this.expDay;
        }
        if (LocalDate.now().isAfter(this.producedOn.plusDays(ex))){
            this.isFresh = true;
        }else {
            this.isFresh = false;
        }
    }
    public void generateDate(){
       this.producedOn = LocalDate.of(2023,
               random.nextInt(8)+1,
               random.nextInt(30)+1);
    }

    public void setPlace(){
        int randomNumer = random.nextInt(2);
        if (randomNumer == 1 ){
            this.placeOfProduct = "Show-Case";
        }else {
            this.placeOfProduct = "Ice-Box";
        }
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getExpDay() {
        return expDay;
    }



    public boolean getIsFresh() {
        return this.isFresh;
    }

    public LocalDate getProducedOn() {
        return producedOn;
    }

    public void setProducedOn(LocalDate producedOn) {
        this.producedOn = producedOn;
    }

    public String getPlaceOfProduct() {
        return placeOfProduct;
    }

    public void setPlaceOfProduct(String placeOfProduct) {
        this.placeOfProduct = placeOfProduct;
    }
}
