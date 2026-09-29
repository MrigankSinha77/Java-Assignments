class Vehicle {
    String name;
    String brand;
    int speed;

    Vehicle(String name, String brand, int speed) {
        this.name = name;
        this.brand = brand;
        this.speed = speed;
    }

    class Details {
        void show() {
            System.out.println("Vehicle Name: " + name);
            System.out.println("Brand: " + brand);
            System.out.println("Top Speed: " + speed + " km/h");
        }
    }
}

class Action {
    void perform() {}
}

public class assignment6_vehicle {
    public static void main(String[] args) {
        Vehicle v = new Vehicle("Car", "Tesla", 230);

        Vehicle.Details details = v.new Details();
        details.show();

        Action start = new Action() {
            void perform() {
                System.out.println(v.name + " has started moving.");
            }
        };

        start.perform();
    }
}
