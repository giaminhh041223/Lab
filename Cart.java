package AimsP;
import java.util.ArrayList;
public class Cart {
	public static final int MAX_NUMBERS_ORDERED=20;
	private ArrayList<DigitalVideoDisc> itemsOrdered = new ArrayList<>();
	private int qtyOrdered = 0;
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered <= MAX_NUMBERS_ORDERED) { 
            itemsOrdered.add(disc);
            qtyOrdered++;
            System.out.println("The disc has been added.");
        } else {
            System.out.println("The cart is almost full.");
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        if (itemsOrdered.remove(disc)) {
            qtyOrdered--;
            System.out.println("The disc has been removed.");
        } else {
            System.out.println("The disc is not in the cart.");
        }
    }

    public double totalCost() {
        double total = 0;
        for (DigitalVideoDisc disc : itemsOrdered) {
            total += disc.getCost();
        }
        return total;
    }
}
