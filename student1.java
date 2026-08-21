class student
{
    String name;
    int rollno;
    String branch;
    String spec;
    
    void display()
    {
        System.out.println("Name:"+name);
        System.out.println("Roll no: "+rollno);
        System.out.println("Branch:"+branch);
        System.out.println("Specialization:"+spec);
    }
}

class student1
 {
    public static void main(String[] args)
    {
        student s1=new student();
        s1.name="MJ";
        s1.rollno=1085;
        s1.branch="BTECH";
        s1.spec="CS";
        s1.display();
        
        
    }
}
