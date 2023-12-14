import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        System.out.println("1. Ruppe");
        System.out.println("2. Dollar");
        System.out.println("3. Euro");

        // take currency choose
        Scanner console = new Scanner(System.in);
        System.out.println("Please enter the number that corresponds to the currency you wish to choose.");
        int choice = console.nextInt();
        System.out.println("Please enter the amount you wish to convert");
        double amount = console.nextDouble();

        // convert chosen currency to other currency
        switch (choice) {
            case 1:
                Ruppe_to_other(amount);
                break;
            case 2:
                Dollar_to_other(amount);
                break;
            case 3:
                Euro_to_other(amount);
                break;
            default:
                System.out.println("Invalid choice");
        }

    }
}
