import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for their income
        System.out.print("Enter your income: ");

        // Read the income value entered by the user
        int income = scanner.nextInt();

        // Determine the tax rate based on the income
        if (income < 500) {
            System.out.println("Tax Rate = 10%");
        } else if (income >= 500 && income < 1500) {
            System.out.println("Tax Rate = 15%");
        } else if (income >= 1500 && income < 2500) {
            System.out.println("Tax Rate = 20%");
        } else if (income >= 2500) {
            System.out.println("Tax Rate = 30%");
        }

        // Close the scanner
        scanner.close();
    }
}

