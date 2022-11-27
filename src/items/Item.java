package items;

public class Item {

    public final String itemName;
    public final Category categoryType;
    public final boolean isProductImported;
    public final float productPrice;
    public float productPriceAfterTax = 0.0f;

    public Item(String name, Category category, boolean isProductImported, float productPrice) {

        this.itemName = name;
        this.categoryType = category;
        this.isProductImported = isProductImported;
        this.productPrice = productPrice;
    }
}
