class Mobile {

    String brand;
    String model;
    int price;
    int quantity;

    // Parameterized Constructor
    Mobile(String brand, String model, int price, int quantity) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.quantity = quantity;
    }

    // Copy Constructor
    Mobile(Mobile mobile) {
        brand = mobile.brand;
        model = mobile.model;
        price = mobile.price;
        quantity = mobile.quantity;
    }

    // Method to display mobile details
    void displayDetails() {
        System.out.println("Brand    : " + brand);
        System.out.println("Model    : " + model);
        System.out.println("Price    : " + price);
        System.out.println("Quantity : " + quantity);

    }
}

public class assignment2_mobile {


    public static void main(String[] args) {

        // Creating original mobile objects
        Mobile phone1 = new Mobile("Samsung", "Galaxy S25FE", 53000, 01);
        Mobile phone2 = new Mobile("Google", "Pixel 10a", 59000, 07);

        // Creating duplicate objects using Copy Constructor
        Mobile copyPhone1 = new Mobile(phone1);
        Mobile copyPhone2 = new Mobile(phone2);

        System.out.println("Original Mobile Records");
        phone1.displayDetails();
        phone2.displayDetails();

        System.out.println("Copied Mobile Records");
        copyPhone1.displayDetails();
        copyPhone2.displayDetails();
    }
}
