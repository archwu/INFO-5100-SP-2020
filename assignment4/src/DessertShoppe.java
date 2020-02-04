public class DessertShoppe {
    private final static float TAX_RATE = 0.02f;
    static String header;

    static String cents2dollarsAndCents(int cents) {
        int intPart = cents / 100;
        int decimalPart = cents % 100;
        return String.format("%d.%d",intPart, decimalPart);
    }
}
