import items.Category;
import items.Item;
import tax.Receipt;

public class Main {

    public static void main (String args[]) {

        // 1st input
        Item book = new Item("1 Book", Category.BOOK, false, 12.49f);
        Item musicCd = new Item("1 Music CD", Category.OTHER, false, 14.99f);
        Item chocolate = new Item("1 Chocolate bar", Category.FOOD, false, 0.85f);

        Receipt receipt1 = new Receipt();
        receipt1.addItem(book);
        receipt1.addItem(musicCd);
        receipt1.addItem(chocolate);

        System.out.println("1st test case: ");
        receipt1.printItems();

        // 2nd input
        Item choco = new Item("1 box of chocolates", Category.FOOD, true, 10.00f);
        Item perfume = new Item("1 bottle of perfume", Category.OTHER, true, 47.50f);

        Receipt receipt2 = new Receipt();
        receipt2.addItem(choco);
        receipt2.addItem(perfume);

        System.out.println("2nd test case: ");
        receipt2.printItems();


        // 3rd input
        Item per1 = new Item("1 bottle of perfume", Category.OTHER, true, 27.99f);
        Item per2 = new Item("1 bottle of perfume", Category.OTHER, false, 18.99f);
        Item med1 = new Item("1 packet of headache pills", Category.MEDICAL_PRODUCT, false, 9.75f);
        Item ch1 = new Item("1 box of imported chocolates", Category.FOOD, true, 11.25f);

        Receipt receipt3 = new Receipt();
        receipt3.addItem(per1);
        receipt3.addItem(per2);
        receipt3.addItem(med1);
        receipt3.addItem(ch1);

        System.out.println("3rd test case: ");
        receipt3.printItems();


    }
}
