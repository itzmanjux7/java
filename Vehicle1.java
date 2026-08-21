import java.util.Scanner;

class Vehicle {
    String drive() {
        return "Vehicle is moving";
    }
}

class Car extends Vehicle {
    String name;

    void getDriverDetails(Scanner sc) {
        System.out.print("Enter name : ");
        name = sc.next();
    }

    @Override
    String drive() {
        return "Enter name: " + name;
    }
}

public class Vehicle1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Car c = new Car();
        c.getDriverDetails(sc);

        System.out.println(c.drive());

        sc.close();
    }
}