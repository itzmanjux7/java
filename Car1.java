class car{
    String color;
    int speed;
    String model;
    
    void display()
    {
        System.out.println("Color:"+color);
        System.out.println("Speed:"+speed);
        System.out.println("Model:"+model);
    }
}

public class Car1{
    public static void main(String[]args)
    {
        car c1=new car();
        c1.color="Red";
        c1.speed=120;
        c1.model="VDX";
        c1.display();
    }
}
