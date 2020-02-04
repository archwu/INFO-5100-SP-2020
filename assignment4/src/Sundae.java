public class Sundae extends IceCream {
    int costOfTopping;
    String toppingName;


    public Sundae(String name, int cost, String toppingName, int costOfTopping){
        super(name, cost);
        this.costOfTopping = costOfTopping;
        this.toppingName = toppingName;
    }

    @Override
    public int getCost() {
        return super.getCost() + costOfTopping;
    }

    //TODO
    public String getString() {
        return String.format("%-30s", toppingName) + "\n" +String.format("%-30s%5s\n", name, DessertShoppe.cents2dollarsAndCents(getCost()));
    }
}
