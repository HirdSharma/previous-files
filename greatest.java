import java.util.*;
public class greatest{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>=c && a>=b){
            System.out.println("greatest is"+ a);
        }
        else if(b>=c){
            System.out.println("greatest is"+ b);

        }
        else{
            System.out.println("greatest is"+ c);
        }
    }
}