package tax;

import items.Category;
import items.Item;

import java.util.ArrayList;
import java.util.List;

public class Receipt {

    private List<Item> items;
    private float saleTaxTotal = 0.0f;
    private float totalPrice = 0.0f;

    public Receipt() {
        items = new ArrayList<Item>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void printItems(){

       TaxCalculator taxCalculator;

       for(Item item : items) {

            String imported = (item.isProductImported) ? "imported " : "";
            if( item.categoryType == Category.OTHER ) {
                taxCalculator = new BasicSaleTax(item);
                item.productPriceAfterTax += taxCalculator.taxCalculation();
            }

            if(item.isProductImported == true) {
                taxCalculator = new ImportedSaleTax(item);
                item.productPriceAfterTax += taxCalculator.taxCalculation();
            }

            this.totalPrice += item.productPrice;
            this.saleTaxTotal +=  item.productPriceAfterTax;
            item.productPriceAfterTax += item.productPrice;
            System.out.println(item.itemName+ " " + imported + " : "+ item.productPriceAfterTax);
       }

        this.totalPrice = this.totalPrice + this.saleTaxTotal;
        System.out.println("Sales taxes : "+ this.saleTaxTotal);
        System.out.println("Total : "+  totalPrice);

    }
}
