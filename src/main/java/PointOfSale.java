import java.util.Scanner;

public class PointOfSale {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        double regularSandwichPrice = 5.45;
        double largeSandwichPrice = 8.95;
        double selectedSandwichPrice = 0;

        System.out.println("Select a size for your sandwich (press #1 or #2): ");
        System.out.println("# 1. Regular: base price $5.45");
        System.out.println("# 2. Large: base price $8.95");

        int userChoice = read.nextInt();

        if (userChoice == 1) {
            selectedSandwichPrice = regularSandwichPrice;
        }
        else if (userChoice == 2) {
            selectedSandwichPrice = largeSandwichPrice;
        }
//        else {
//            System.out.println("ERROR: Invalid selection.");
//        }

        read.nextLine();

        System.out.println("Would you like your sandwich to be loaded? (press Y or N)");
        String isLoaded = read.nextLine();
        if (isLoaded.equalsIgnoreCase("Y")) {
            selectedSandwichPrice += 1.00;
        } else if (isLoaded.equalsIgnoreCase("N")) {
            selectedSandwichPrice += 1.75;
        }

        double discountTen = 0.1 * selectedSandwichPrice;
        double discountTwenty = 0.2 * selectedSandwichPrice;

        System.out.println("Please enter your age: ");
        int userAge = read.nextInt();

        if (userAge <= 17) {
            selectedSandwichPrice -= discountTen;
            System.out.println("Child discount applied!");
            System.out.printf("Your sandwich costs: $%.2f", selectedSandwichPrice);
        }
        else if (userAge >= 65) {
            selectedSandwichPrice -= discountTwenty;
            System.out.println("Senior citizen discount applied!");
            System.out.printf("Your sandwich costs: $%.2f", selectedSandwichPrice);
        }
        else {
            System.out.printf("Your sandwich costs: $%.2f", selectedSandwichPrice);
        }
        read.close();
    }
}
