public class copyconstructor{
    public static void main(String args[]){
        student s1=new student();
        s1.name="hirota";
        s1.marks=45;
        s1.password="Hzmeme";
        s1.sno[0]=10;
        s1.sno[1]=88;
        s1.sno[2]=44;
        student s2=new student(s1);//declaring copy constructor
        s2.password="Hirdesh@123";
        s1.sno[1]=33;
        for(int i=0;i<3;i++){
            System.out.println(s2.sno[i]);
        }
        System.out.println(s2.password);
        
        
    }
}
class student{
    String name;
    int marks;
    String password;
    int sno[];
    //copy constructor
    student(student s1){
        this.name=s1.name;
        this.marks=s1.marks;
        this.sno=s1.sno;//indicates reference of array of s1 array
    }
    student(){
        sno=new int[3];
        System.out.println("constructor is calling");
    }
    student(String name){
        sno=new int[3];
        this.name=name;
    }
    student(int marks){
        sno=new int[3];
        this.marks=marks;
    }
}