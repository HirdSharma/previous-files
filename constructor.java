public class constructor{
    public static void main(String args[]){
        student s1=new student("hirdesh",30);
        System.out.println(s1.name);
        System.out.println(s1.cgpa);
        Pen p1=new Pen();
        
    }
}
class student{
    String name;
    int cgpa;
    student(String name,int cgpa){
        this.name=name;
        this.cgpa=cgpa;
        
    }
}
class Pen{
    Pen(){
        System.out.println("constructor is calling");
    }

}