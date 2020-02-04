public class IceCream extends DessertItem {
    int cost;

    public IceCream(String name, int cost){
        super(name);
        this.cost = cost;
    }

    @Override
    public int getCost() {
        return cost;
    }

    //TODO
    public String getString() {
        return String.format("%-30s%5s\n", name, DessertShoppe.cents2dollarsAndCents(getCost()));
    }
}
