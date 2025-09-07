import java.util.Scanner;

abstract class Customer {
    abstract double getDiscountedBill(double amount);
    abstract String getCustomerType();
}

class RegularCustomer extends Customer {
    @Override
    double getDiscountedBill(double amount) {
        return amount * 0.95; 
    }

    @Override
    String getCustomerType() {
        return "Regular";
    }
}

class PremiumCustomer extends Customer {
    @Override
    double getDiscountedBill(double amount) {
        return amount * 0.90; 
    }

    @Override
    String getCustomerType() {
        return "Premium";
    }
}

class VIPCustomer extends Customer {
    @Override
    double getDiscountedBill(double amount) {
        return amount * 0.80; 
    }

    @Override
    String getCustomerType() {
        return "VIP";
    }
}

public class OnlineShoppingDiscountSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double purchaseAmount = 5000.0;

    
        Customer regular = new RegularCustomer();
        Customer premium = new PremiumCustomer();
        Customer vip = new VIPCustomer();


        System.out.println("\n--- Predefined Customer Bills for Rs. " + purchaseAmount + " ---");
        displayBill(regular, purchaseAmount);
        displayBill(premium, purchaseAmount);
        displayBill(vip, purchaseAmount);

    
        System.out.println("\n--- User-Selected Customer Invoice ---");
        System.out.println("Select Customer Type:");
        System.out.println("1. Regular (5% discount)");
        System.out.println("2. Premium (10% discount)");
        System.out.println("3. VIP (20% discount)");
        System.out.print("Enter choice (1-3): ");
        int choice = scanner.nextInt();

        Customer selectedCustomer;
        switch (choice) {
            case 1:
                selectedCustomer = new RegularCustomer();
                break;
            case 2:
                selectedCustomer = new PremiumCustomer();
                break;
            case 3:
                selectedCustomer = new VIPCustomer();
                break;
            default:
                System.out.println("Invalid choice. Defaulting to Regular Customer.");
                selectedCustomer = new RegularCustomer();
                break;
        }

      
        displayInvoice(selectedCustomer, purchaseAmount);
        scanner.close();
    }

    private static void displayBill(Customer customer, double amount) {
        double finalBill = customer.getDiscountedBill(amount);
        System.out.printf("%s Customer: Original Amount: Rs. %.2f, Final Bill: Rs. %.2f%n",
                customer.getCustomerType(), amount, finalBill);
    }

    private static void displayInvoice(Customer customer, double amount) {
        double finalBill = customer.getDiscountedBill(amount);
        double discount = amount - finalBill;
        System.out.println("\n--- Final Invoice ---");
        System.out.println("Customer Type: " + customer.getCustomerType());
        System.out.printf("Original Amount: Rs. %.2f%n", amount);
        System.out.printf("Discount Applied: Rs. %.2f%n", discount);
        System.out.printf("Final Bill: Rs. %.2f%n", finalBill);
    }
}