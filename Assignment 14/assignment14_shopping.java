import java.util.Scanner;

public class assignment14_shopping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter product quantity: ");
            int quantity = sc.nextInt();

            if (quantity <= 0) {
                throw new Exception();
            }

            System.out.println("Product quantity: " + quantity);
            System.out.println("Order placed successfully");
        }
        catch (Exception e) {
            System.out.println("Invalid product quantity");
        }
    }
}
