interface ProductInfo {
    void showDetails();
}

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

class Electronic extends Product implements ProductInfo {
    int warrantyYears;

    Electronic(String name, double price, int warrantyYears) {
        super(name, price);
        this.warrantyYears = warrantyYears;
    }

    public void showDetails() {
        System.out.println("Electronic Item: " + name);
        System.out.println("Price: Rs " + price);
        System.out.println("Warranty: " + warrantyYears + " years");
    }
}

class Clothing extends Product implements ProductInfo {
    String size;

    Clothing(String name, double price, String size) {
        super(name, price);
        this.size = size;
    }

    public void showDetails() {
        System.out.println("Clothing Item: " + name);
        System.out.println("Price: Rs " + price);
        System.out.println("Size: " + size);
    }
}

class Grocery extends Product implements ProductInfo {
    String expiryDate;

    Grocery(String name, double price, String expiryDate) {
        super(name, price);
        this.expiryDate = expiryDate;
    }

    public void showDetails() {
        System.out.println("Grocery Item: " + name);
        System.out.println("Price: Rs " + price);
        System.out.println("Expiry Date: " + expiryDate);
    }
}

public class assignment7_products {
    public static void main(String[] args) {
        Electronic phone = new Electronic("Smartphone", 50000, 2);
        Clothing shirt = new Clothing("Shirt", 799, "XL");
        Grocery milk = new Grocery("Milk", 60, "15-08-2026");

        phone.showDetails();
        System.out.println("--------");
        shirt.showDetails();
        System.out.println("--------");
        milk.showDetails();
    }
}
