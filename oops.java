//this is getters , setters,this keyword
public class oops{
    public static void main(String args[]){
        student s1=new student();
        s1.setname("hirdesh sharma");
        System.out.println(s1.getname());
        s1.setage(20);
        System.out.println(s1.getage());
        s1.setpercentage(89);
        System.out.println(s1.getpercentage());
        s1.setpercentage(90);
        System.out.println(s1.getpercentage());
        s1.setage(19);
        System.out.println(s1.getage());
    }
}
class student{
    private String name;
    private int age;
    private float percentage;
    String getname(){
        return this.name;
    }
    int getage(){
        return this.age;
    }
    float getpercentage(){
        return this.percentage;
    }
    void setname(String naam){
        this.name=naam;
    }
    void setage(int umar){
        this.age=umar;
    }
    void setpercentage(float score){
        this.percentage=score;
    }


}