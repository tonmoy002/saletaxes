package tax;

import items.Item;

public class BasicSaleTax implements TaxCalculator{

    // 10% basic sale tax
    private final float basicTax = 0.1f;
    private Item item;

    public BasicSaleTax(Item item) {
        this.item = item;
    }

    @Override
    public float taxCalculation() {
        
        return basicTax * item.productPrice;
    }
}
