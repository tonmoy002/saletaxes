package tax;

import items.Item;

import java.util.ArrayList;
import java.util.List;

public class Receipt {

    private List<Item> items;

    public Receipt() {
        items = new ArrayList<Item>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void printItems(){

       for(Item item : items){
            String imported = (item.isProductImported) ? "imported " : "";
            System.out.println(item.itemName+ " " + imported + " : "+ item.productPrice);
       }

    }
}
