// ---------- Vehicle class ----------
class Vehicle {
    private String registrationNumber;
    private String ownerName;
    private String model;
    private int manufacturingYear;

    // Default constructor: preliminary registration, only placeholder values available
    public Vehicle() {
        this.registrationNumber = "NOT_ASSIGNED";
        this.ownerName = "Unknown";
        this.model = "Unknown";
        this.manufacturingYear = 0;
    }

    // Parameterized constructor: all details supplied
    public Vehicle(String registrationNumber, String ownerName, String model, int manufacturingYear) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.model = model;
        this.manufacturingYear = manufacturingYear;
    }

    // Copy constructor: builds a NEW object carrying the same state as the source
    public Vehicle(Vehicle other) {
        this.registrationNumber = other.registrationNumber;
        this.ownerName = other.ownerName;
        this.model = other.model;
        this.manufacturingYear = other.manufacturingYear;
    }

    // Setters (used to show the copy is independent of the original)
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int calculateVehicleAge(int currentYear) {
        if (manufacturingYear <= 0 || currentYear < manufacturingYear) {
            return 0;   // year unknown or invalid
        }
        return currentYear - manufacturingYear;
    }

    public void display(int currentYear) {
        System.out.println("Registration No : " + registrationNumber);
        System.out.println("Owner Name      : " + ownerName);
        System.out.println("Model           : " + model);
        System.out.println("Manufacture Year: " + (manufacturingYear == 0 ? "Unknown" : String.valueOf(manufacturingYear)));
        System.out.println("Vehicle Age     : " + calculateVehicleAge(currentYear) + " year(s)");
    }
}

// ---------- Driver ----------
public class Main {
    public static void main(String[] args) {
        int currentYear = java.time.Year.now().getValue();

        System.out.println("TC1: Default constructor -> new Vehicle()");
        Vehicle v1 = new Vehicle();
        v1.display(currentYear);

        System.out.println("\nTC2: Parameterized constructor -> new Vehicle(\"OD02AB1234\", \"Riya\", \"Swift\", 2023)");
        Vehicle v2 = new Vehicle("OD02AB1234", "Riya", "Swift", 2023);
        v2.display(currentYear);

        System.out.println("\nTC3: Copy constructor -> new Vehicle(existingVehicle)");
        Vehicle v3 = new Vehicle(v2);
        v3.display(currentYear);

        // Show the copy is a separate object, not just a copied reference
        System.out.println("\nVerification: changing the copy's owner must not affect the original");
        v3.setOwnerName("Aman");
        System.out.println("Original vehicle after changing the copy:");
        v2.display(currentYear);
        System.out.println("v2 == v3 (same reference)? " + (v2 == v3));
    }
}
