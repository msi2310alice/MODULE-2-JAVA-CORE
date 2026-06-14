import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        double rate = 23000;
        Scanner scanner = new Scanner(System.in);
        double USD;
        System.out.print("Enter USD: ");
        USD = scanner.nextDouble();
        double VND = rate * USD;
        System.out.printf("%-5.2f USD = %-5.2f VND", USD, VND);


    }
}
