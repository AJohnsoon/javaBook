package chapter14.entities.example05;

public class ImportedProduct extends Product{
    private Double customsFee;

    public ImportedProduct(){}

    public ImportedProduct(String name, Double price, Double customFee) {
        super(name, price);
        this.customsFee = customFee;
    }

    public Double getCustomFee() {
        return customsFee;
    }

    public void setCustomFee(Double customFee) {
        this.customsFee = customFee;
    }

    public Double totalPrice(){
        return price += customsFee;
    }

    @Override
    public String priceTag(){
        return "Imported -> "+ this.getName() +" U$"+ this.getPrice() + " (Custom fee: $"+customsFee+")";
    }


    @Override
    public String toString() {
        return "\nImportedProduct {" +
                "\n ImportedProduct Name: " + this.getName() +
                "\n ImportedProduct Price: " + this.getPrice() +
                "\n Tag:" + priceTag() +
                "\n }";
    }

}
