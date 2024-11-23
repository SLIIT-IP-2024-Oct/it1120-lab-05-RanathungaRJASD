import java.util.Scanner;

public class ResortCalculator {
    // Constants
    private static final double ROOM_CHARGE_PER_DAY = 48000.00;
    private static final int MIN_DAYS_FOR_DISCOUNT = 3;
    private static final double DISCOUNT_RATE_3_4_DAYS = 0.10; // 10%
    private static final double DISCOUNT_RATE_5_PLUS = 0.20;   // 20%
    private static final int MIN_DATE = 1;
    private static final int MAX_DATE = 31;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startDate, endDate, numberOfDays;
        double totalAmount, discount;
        
        // Input and validate start date
        System.out.print("Enter start date (1-31): ");
        startDate = scanner.nextInt();
        
        // Validation 1 for start date
        if (startDate < MIN_DATE || startDate > MAX_DATE) {
            System.out.println("Error: Start date must be between 1 and 31");
            scanner.close();
            return;
        }
        
        // Input and validate end date
        System.out.print("Enter end date (1-31): ");
        endDate = scanner.nextInt();
        
        // Validation 1 for end date
        if (endDate < MIN_DATE || endDate > MAX_DATE) {
            System.out.println("Error: End date must be between 1 and 31");
            scanner.close();
            return;
        }
        
        // Validation 2
        if (startDate >= endDate) {
            System.out.println("Error: Start date must be less than end date");
            scanner.close();
            return;
        }
        
        // Calculate number of days
        numberOfDays = endDate - startDate;
        
        // Calculate base amount
        totalAmount = numberOfDays * ROOM_CHARGE_PER_DAY;
        
        // Calculate discount if applicable
        if (numberOfDays < MIN_DAYS_FOR_DISCOUNT) {
            discount = 0;
        } else if (numberOfDays <= 4) {
            discount = totalAmount * DISCOUNT_RATE_3_4_DAYS;
        } else {
            discount = totalAmount * DISCOUNT_RATE_5_PLUS;
        }
        
        // Apply discount
        totalAmount -= discount;
        
        // Display results
        System.out.println("\n=== Reservation Summary ===");
        System.out.println("Start Date: December " + startDate);
        System.out.println("End Date: December " + endDate);
        System.out.println("Number of Days: " + numberOfDays);
        System.out.printf("Room Charges: Rs %.2f%n", (numberOfDays * ROOM_CHARGE_PER_DAY));
        System.out.printf("Discount Amount: Rs %.2f%n", discount);
        System.out.printf("Total Amount to be Paid: Rs %.2f%n", totalAmount);
        
        scanner.close();
    }
}