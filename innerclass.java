class outer{
    void display(){
        int x = 20;
        class localinnerclass{
            void show(){
                System.out.println("Local inner class:"+x);

            }
        }
        localinnerclass obj = new localinnerclass();
        obj.show();
    }
}
class innerclass{
    public static void main(String [] args){
        outer obj = new outer();
        obj.display();
    }
}