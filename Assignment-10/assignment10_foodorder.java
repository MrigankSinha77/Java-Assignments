abstract class FoodOrder {
    abstract void calculateBill();
}

class DineInOrder extends FoodOrder {
    void calculateBill() {
        double foodBill = 700;
        double serviceCharge = 35;
        double total = foodBill + serviceCharge;

        System.out.println("Dine-In Order Bill: " + total);
    }
}

class TakeAwayOrder extends FoodOrder {
    void calculateBill() {
        double foodBill = 370;
        double packingCharge = 45;
        double total = foodBill + packingCharge;

        System.out.println("Take-Away Order Bill: " + total);
    }
}

public class assignment10_foodorder {
    public static void main(String[] args) {
        DineInOrder d = new DineInOrder();
        TakeAwayOrder t = new TakeAwayOrder();

        d.calculateBill();
        t.calculateBill();
    }
}
