class calculater{
    int add(int a, int b){
    return a+b;
    }
    
    int add(int a,int b, int c){
        return a+b+c;
        
    }
     double add(double a, double b){
         return a+b;
     }
    
}
class overriding{
    public static void main(String [] args){
        calculater c = new calculater();
        System.out.println(c.add(10,20));
        System.out.println(c.add(10,20,30));
        System.out.println(c.add(10.0,20.0));
        
    }
}