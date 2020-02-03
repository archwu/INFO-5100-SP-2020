abstract class DessertItem {
    protected String name;

    public DessertItem() {

    }

    public DessertItem(String name) {
        this.name = name;
    }

    public abstract float getCost();

    public final String getName() {
        return this.name;
    }

}
