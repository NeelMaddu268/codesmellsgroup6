
public class TaxableItem extends Item {
    private double taxRate = 7;
    
    public TaxableItem(Item item){
        super(item.getName(), item.getPrice(), item.getQuantity(), item.getDiscountAmount());
    }

    public double getTaxRate(){
        return taxRate;
    }
    public void setTaxRate(double rate) {
        if(rate>=0){
            taxRate = rate;
        }
    }

    @Override
    public double getDiscountPrice() {
        double discountPrice = getPrice() - (getPrice() - getDiscountAmount());
        double taxAmount = (taxRate / 100.0) * getPrice();
        return discountPrice + taxAmount;
    }
}
