public class Candy extends DessertItem{
    float weight;
    int pricePerPound;

    public Candy(String name, float weight, int pricePerPound){
        super(name);
        this.weight = weight;
        this.pricePerPound = pricePerPound;
    }

    @Override
    public int getCost() {
        return Math.round(weight * pricePerPound);
    }

    //TODO
    public String getString() {
        return String.format("%-30s%5s\n", name, DessertShoppe.cents2dollarsAndCents(getCost()));
    }
}
