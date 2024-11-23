import java.util.Scanner;

public class PrizeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int newMembers;

        // Input with validation
        do {
            System.out.print("Enter the number of new members introduced: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Please enter a valid number.");
                System.out.print("Enter the number of new members introduced: ");
                scanner.next(); // Clear invalid input
            }
            newMembers = scanner.nextInt();
            
            if (newMembers < 0) {
                System.out.println("Number of members cannot be negative! Please try again.");
            }
        } while (newMembers < 0);

        // Determine prize using switch
        System.out.print("\nPrize entitled: ");
        
        // For numbers >= 5, we'll use 5 in the switch
        int switchValue = Math.min(newMembers, 5);
        
        switch (switchValue) {
            case 0:
                System.out.println("No Prize");
                break;
            case 1:
                System.out.println("Pen");
                break;
            case 2:
                System.out.println("Umbrella");
                break;
            case 3:
                System.out.println("Bag");
                break;
            case 4:
                System.out.println("Travelling Chair");
                break;
            case 5:
                System.out.println("Headphone");
                break;
            default:
                System.out.println("Error in prize calculation!");
                break;
        }

        // Print summary
        System.out.println("\nSummary:");
        System.out.println("Number of new members introduced: " + newMembers);
        
        scanner.close();
    }
}