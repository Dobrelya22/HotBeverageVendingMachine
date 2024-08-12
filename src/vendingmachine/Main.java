package vendingmachine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HotBeverage tea = new HotBeverage("Tea", 250, 85);
        HotBeverage coffee = new HotBeverage("Coffee", 200, 90);

        HotBeverageVendingMachine vendingMachine = new HotBeverageVendingMachine();
        vendingMachine.addProduct(tea);
        vendingMachine.addProduct(coffee);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to the Hot Beverage Vending Machine!");
            System.out.println("Please select your beverage:");
            System.out.println("1. Tea");
            System.out.println("2. Coffee");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1-3): ");
            int choice = scanner.nextInt();

            if (choice == 3) {
                System.out.println("Thank you for using the vending machine. Goodbye!");
                break;
            }

            String name;
            if (choice == 1) {
                name = "Tea";
            } else if (choice == 2) {
                name = "Coffee";
            } else {
                System.out.println("Invalid choice. Please try again.");
                continue;
            }

            System.out.print("Enter volume (ml): ");
            int volume = scanner.nextInt();

            System.out.print("Enter temperature (°C): ");
            int temperature = scanner.nextInt();

            HotBeverage order = vendingMachine.getProduct(name, volume, temperature);

            if (order != null) {
                System.out.println("You got: " + order);
            } else {
                System.out.println("This beverage is not available.");
            }

            System.out.println();
        }

        scanner.close();
    }
}

