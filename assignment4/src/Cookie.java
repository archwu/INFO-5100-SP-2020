public class Cookie extends DessertItem {
    int number;
    int pricePerDozen;
    static final int DOZEN = 12;

    public Cookie(String name, int number, int pricePerDozen) {
        super(name);
        this.number = number;
        this.pricePerDozen = pricePerDozen;
    }

    @Override
    public int getCost() {
        return Math.round((float)(number / DOZEN) * pricePerDozen);
    }

    //TODO
    public String getString() {
        return String.format("%-30s%5s\n", name, DessertShoppe.cents2dollarsAndCents(getCost()));
    }
}
