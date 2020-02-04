abstract class DessertItem {
    protected String name;

    public DessertItem() {
        name = null;
    }

    public DessertItem(String name) {
        this.name = name;
    }

    public abstract int getCost();

    public final String getName() {
        return this.name;
    }

    public abstract String getString();
}
