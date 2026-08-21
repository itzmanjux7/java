import java.util.Scanner;

class Shape {
    double getArea() {
        return 0.0;
    }
}

class Rectangle extends Shape {
    private double length;
    private double breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double getArea() {
        return length * breadth;
    }
}

public class Shape1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        double length = sc.nextDouble();

        System.out.print("Enter breadth: ");
        double breadth = sc.nextDouble();

        Shape s = new Rectangle(length, breadth); 
        System.out.println("Area of rectangle: " + s.getArea());

        sc.close(); 
    }
}