class Vehicle {
    String vehicleNumber = "BH07MS0773";
    String vehicleType = "Car";

    void displayVehicle() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Vehicle Type: " + vehicleType);
    }
}

class VehicleInsurance extends Vehicle {
    void displayInsurance() {
        System.out.println("Vehicle Insurance Details:");
        System.out.println("Vehicle Number: " + super.vehicleNumber);
        System.out.println("Vehicle Type: " + super.vehicleType);
    }
}

public class assignment8_insurance {
    public static void main(String[] args) {
        VehicleInsurance v = new VehicleInsurance();
        v.displayInsurance();
    }
}
