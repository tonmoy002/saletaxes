import items.Category;
import items.Item;
import tax.Receipt;

public class Main {

    public static void main (String args[]) {

        Item book = new Item("1 Book", Category.BOOK, false, 12.49f);
        Item musicCd = new Item("1 Music CD", Category.OTHER, false, 14.99f);
        Item chocolate = new Item("1 Chocolate bar", Category.FOOD, true, 0.85f);

        Receipt receipt = new Receipt();
        receipt.addItem(book);
        receipt.addItem(musicCd);
        receipt.addItem(chocolate);

        receipt.printItems();

    }
}
