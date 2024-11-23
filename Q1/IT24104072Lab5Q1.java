import java.util.Scanner;

public class MinMaxFinder {
    public static void main(String[] args) {
        // Create Scanner object for reading input
        Scanner scanner = new Scanner(System.in);
        
        // Variables to store the three numbers
        int num1, num2, num3;
        
        // Read input from user
        System.out.println("Enter first number:");
        num1 = scanner.nextInt();
        
        System.out.println("Enter second number:");
        num2 = scanner.nextInt();
        
        System.out.println("Enter third number:");
        num3 = scanner.nextInt();
        
        // Find the smallest number
        int smallest = num1;
        if (num2 < smallest) {
            smallest = num2;
        }
        if (num3 < smallest) {
            smallest = num3;
        }
        
        // Find the largest number
        int largest = num1;
        if (num2 > largest) {
            largest = num2;
        }
        if (num3 > largest) {
            largest = num3;
        }
        
        // Display results
        System.out.println("\nThe smallest number is: " + smallest);
        System.out.println("The largest number is: " + largest);
        
        // Close the scanner
        scanner.close();
    }
}