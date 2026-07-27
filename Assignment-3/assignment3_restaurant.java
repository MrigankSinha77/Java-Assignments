class RestaurantBilling {
    static int totalOrders = 0;

    // Dine-in bill
    double calculateBill(double amount) {
        totalOrders++;
        return amount;
    }

    // Takeaway bill (with packing charge)
    double calculateBill(double amount, double packingCharge) {
        totalOrders++;
        return amount + packingCharge;
    }

    // Delivery bill (with packing and delivery charge)
    double calculateBill(double amount, double packingCharge, double deliveryCharge) {
        totalOrders++;
        return amount + packingCharge + deliveryCharge;
    }

    static void showTotalOrders() {
        System.out.println("Total Orders: " + totalOrders);
    }

    public static void main(String[] args) {
        RestaurantBilling bill = new RestaurantBilling();

        System.out.println("Dine-in Bill: $" + bill.calculateBill(70));
        System.out.println("Takeaway Bill: $" + bill.calculateBill(70, 5));
        System.out.println("Delivery Bill: $" + bill.calculateBill(70, 5, 2));

        RestaurantBilling.showTotalOrders();
    }
}
