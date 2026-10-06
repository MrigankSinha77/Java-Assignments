class Order {
    // Class-level data: ONE copy shared by every Order object
    private static int totalOrders = 0;
    private static double totalRevenue = 0.0;

    // Object-level data: each Order has its own copy
    private String orderType;
    private double billAmount;

    // 1) Simple order: single item (dine-in / takeaway)
    public double calculateBill(double price) {
        orderType = "Simple";
        return finalizeBill(price);
    }

    // 2) Bulk order: price x quantity
    public double calculateBill(double price, int quantity) {
        orderType = "Bulk";
        if (quantity <= 0) {
            System.out.println("Invalid quantity. Order not billed.");
            return 0.0;
        }
        return finalizeBill(price * quantity);
    }

    // 3) Delivery order: price x quantity + delivery charge
    public double calculateBill(double price, int quantity, double deliveryCharge) {
        orderType = "Delivery";
        if (quantity <= 0 || deliveryCharge < 0) {
            System.out.println("Invalid quantity or delivery charge. Order not billed.");
            return 0.0;
        }
        return finalizeBill(price * quantity + deliveryCharge);
    }

    // Common step: store the bill and update the shared static counters
    private double finalizeBill(double amount) {
        if (amount < 0) {
            System.out.println("Invalid price. Order not billed.");
            return 0.0;
        }
        billAmount = amount;
        totalOrders++;            // class-level counter, NOT reset per object
        totalRevenue += amount;
        return amount;
    }

    public String getOrderType() { return orderType; }
    public double getBillAmount() { return billAmount; }

    // Static method: works on class-level data, no object needed
    public static void displaySummary() {
        System.out.println("======= Restaurant Summary =======");
        System.out.println("Total orders processed : " + totalOrders);
        System.out.printf("Total revenue          : %.2f%n", totalRevenue);
        System.out.println("==================================");
    }
}

// ---------- Driver ----------
public class Main {
    public static void main(String[] args) {
        // Three separate Order objects
        Order o1 = new Order();
        Order o2 = new Order();
        Order o3 = new Order();

        System.out.println("TC1: calculateBill(500) -> expect 500.00");
        System.out.printf("Bill: %.2f%n%n", o1.calculateBill(500));

        System.out.println("TC2: calculateBill(250, 3) -> expect 750.00");
        System.out.printf("Bill: %.2f%n%n", o2.calculateBill(250, 3));

        System.out.println("TC3: calculateBill(250, 3, 50) -> expect 800.00");
        System.out.printf("Bill: %.2f%n%n", o3.calculateBill(250, 3, 50));

        // Object-level data differs per object
        System.out.println("Object-level data (separate for each object):");
        System.out.printf("o1 -> %s order, %.2f%n", o1.getOrderType(), o1.getBillAmount());
        System.out.printf("o2 -> %s order, %.2f%n", o2.getOrderType(), o2.getBillAmount());
        System.out.printf("o3 -> %s order, %.2f%n%n", o3.getOrderType(), o3.getBillAmount());

        // Class-level data is shared: all three orders are counted together
        System.out.println("Class-level data (shared by all Order objects):");
        Order.displaySummary();   // 3 orders, 2050.00 revenue

        // A new object keeps adding to the SAME counters
        Order o4 = new Order();
        o4.calculateBill(100, 2);
        System.out.println("\nAfter a 4th order from a new object (100 x 2):");
        Order.displaySummary();   // 4 orders, 2250.00 revenue
    }
}
