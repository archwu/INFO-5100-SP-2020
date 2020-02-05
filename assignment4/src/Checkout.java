import java.util.ArrayList;
import java.util.List;


public class Checkout {
    private final static float TAX_RATE = 0.02f;
    private List<DessertItem> items;

    public Checkout() {
        items = new ArrayList<>();
    }

    public int numberOfItems() {
        return items.size();
    }

    public void enterItem(DessertItem dessertItem) {
        items.add(dessertItem);
    }

    public void clear() {
        items = new ArrayList<DessertItem>();
    }

    public int totalCost() {
        int totalCents = 0;
        for (DessertItem d : items) {
            totalCents += d.getCost();
        }
        return totalCents;
    }

    public int totalTax() {
        return Math.round(this.totalCost() * TAX_RATE);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DessertShoppe.header);
        for (DessertItem d : items) {
            sb.append(d.getString());
        }
        sb.append(String.format("\n%-30s %4s\n", "Tax",DessertShoppe.cents2dollarsAndCents(totalTax())));
        sb.append(String.format("%-30s %5s\n", "Total Cost", DessertShoppe.cents2dollarsAndCents(totalCost())));
        return sb.toString();
    }
}
