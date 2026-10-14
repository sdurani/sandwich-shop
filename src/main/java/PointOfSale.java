import java.util.Scanner;

public class PointOfSale {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        double regularSandwichPrice = 5.45;
        double largeSandwichPrice = 8.95;

        System.out.println("Select a size for your sandwich (press #1 or #2): ");
        System.out.println("# 1. Regular: base price $5.45");
        System.out.println("# 2. Large: base price $8.95");

        int userChoice = read.nextInt();

        if (userChoice == 1) {
            System.out.println("Your sandwich costs: " + regularSandwichPrice);
        }
        else if (userChoice == 2) {
            System.out.println("Your sandwich costs: " + largeSandwichPrice);
        }
        else {
            System.out.println("ERROR: Invalid selection.");
        }



    }

}
