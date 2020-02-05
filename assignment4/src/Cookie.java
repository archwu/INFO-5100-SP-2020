public class Cookie extends DessertItem {
    static final int DOZEN = 12;
    int number;
    int pricePerDozen;

    public Cookie(String name, int number, int pricePerDozen) {
        super(name);
        this.number = number;
        this.pricePerDozen = pricePerDozen;
    }

    @Override
    public int getCost() {
        return Math.round(((float) number / (float) DOZEN) * pricePerDozen);
    }

    //TODO
    public String getString() {
        return String.format("%d @ %s /dz.\n", number, DessertShoppe.cents2dollarsAndCents(pricePerDozen))
                + String.format("%-30s%5s\n", name, DessertShoppe.cents2dollarsAndCents(getCost()));
    }
}
