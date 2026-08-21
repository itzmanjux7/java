class Outer{
    private int x = 20;   // private is fine here, x is a class member

    class Inner{
        void show(){
            System.out.println("value of x is: "+x);
        }
    }
}

public class nestedclass{
    public static void main(String[] args){
        Outer o = new Outer();
        Outer.Inner i = o.new Inner();
        i.show();
    }
}