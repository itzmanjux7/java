class Employee {
    String name;
    int age;

    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Salary extends Employee {
    int salary;

    Salary(String name, int age, int salary) {
        super(name, age);
        this.salary = salary;
    }

    void display() {
        System.out.println("\nEmployee Details: ");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}

public class Employee1 {
    public static void main(String[] args) {
        Salary s = new Salary("MJ", 20, 50000);
        s.display();
    }
} 