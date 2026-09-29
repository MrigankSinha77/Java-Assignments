interface Area {
    double calculateArea();
}

class Shape {
    String name;

    Shape(String name) {
        this.name = name;
    }
}

class Circle extends Shape implements Area {
    double radius;

    Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    public double calculateArea() {
        return 3.14 * radius * radius;
    }
}

class Rectangle extends Shape implements Area {
    double length;
    double width;

    Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }
}

public class assignment7_shapes {
    public static void main(String[] args) {
        Circle c = new Circle(7);
        Rectangle r = new Rectangle(7, 17);

        System.out.println(c.name + " Area: " + c.calculateArea());
        System.out.println(r.name + " Area: " + r.calculateArea());
    }
}
