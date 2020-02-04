import java.util.Formatter;
import java.util.Locale;

public class TestCheckout {
    public static void main(String[] args) {
        //Checkout checkout = new Checkout();
        StringBuilder sb = new StringBuilder();
        Formatter formatter = new Formatter(sb, Locale.US);
        formatter.format("|%-10s%10s|","What", "The hell");
        System.out.println(formatter.toString());
    }

}
