
import java.util.*;

public class Exercise11 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("How many euros are you exchanging? ");
        String eur = in.nextLine();
        int euros = Integer.parseInt(eur);

        System.out.print("What is the exchange rate? ");
        String exch = in.nextLine();
        double rate = Double.parseDouble(exch);

        System.out.printf("%d euros at an exchange rate of %f is\n%.2f U.S. Dollars.", euros, rate, euros * rate);

    }
}
