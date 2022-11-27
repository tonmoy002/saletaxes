package tax;

import items.Item;

public class ImportedSaleTax implements TaxCalculator{

    // 5% imported products sale tax
    private final float importedTax = 0.05f;
    private Item item;

    public ImportedSaleTax(Item item) {
        this.item = item;
    }


    @Override
    public float taxCalculation() {
        return importedTax * item.productPrice;
    }
}
