import java.util.*;
public class whileloop{
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        int counter=1;
        while(counter<=i){
            System.out.println("hello world");
            counter++;
        }
        System.out.println("printed times"+i);
    }
}