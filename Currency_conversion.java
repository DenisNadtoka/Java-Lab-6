import java.util.Scanner;

public class Currency_conversion {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input amount and currency of money: ");
        String value = in.nextLine();
        int indexUSD = value.indexOf("USD");
        int indexEUR = value.indexOf("EUR");

        String[] el = value.split(" ");
        double tmp = Double.parseDouble(el[0]);

        if(indexUSD != -1) {
            DollarToUAH dollar_convert = new DollarToUAH();
            System.out.printf(value + " = %.2f UAH", dollar_convert.convert(tmp));
        }

        if(indexEUR != -1) {
            EuroToUAH euro_convert = new EuroToUAH();
            System.out.printf(value + " = %.2f UAH", euro_convert.convert(tmp));
        }
    }
}
