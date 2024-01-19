public class statickeyword{
    public static void main(String args[]){
        student s1=new student();
        s1.schoolname="dps";
        System.out.println(s1.schoolname);
        student s2=new student();
        System.out.println(s2.schoolname);
        student s3=new student();
        s3.schoolname="shiv jyoti";
        System.out.println(s1.schoolname);
        System.out.println(s2.schoolname);
        System.out.println(s3.schoolname);
        System.out.println(s1.sum(10, 30));
        System.out.println(s2.sum(80, 30));

    }
} 
class student{
    int rollno;
    String name;
    static String schoolname;
    static int sum(int a,int b){
        return a+b;
    }
}