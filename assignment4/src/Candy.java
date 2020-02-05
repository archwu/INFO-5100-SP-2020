public class Candy extends DessertItem{
    double weight;
    int pricePerPound;

    public Candy(String name, double weight, int pricePerPound){
        super(name);
        this.weight = weight;
        this.pricePerPound = pricePerPound;
    }

    @Override
    public int getCost() {
        return Math.round((long) (weight * pricePerPound));
    }

    //TODO
    public String getString() {
        return String.format("%.2f lbs. @ %s /lb.\n", weight, DessertShoppe.cents2dollarsAndCents(pricePerPound)) + String.format("%-30s%5s\n", name, DessertShoppe.cents2dollarsAndCents(getCost()));
    }
}
