
public class TaxableItem extends Item {
    private double taxRate = 7;
    
    public TaxableItem(String name, double price, int quantity, DiscountType discountType, double discountAmount, boolean giftCard){
        super(name, price, quantity, discountType, discountAmount, giftCard);
    }

    public double getTaxRate(){
        return taxRate;
    }
    public void setTaxRate(double rate) {
        if(rate>=0){
            taxRate = rate;
        }
    }
}
