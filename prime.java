import java.util.*;
public class prime{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a==2){System.out.println("a prime");}
        else{
        boolean isprime=true;
        for(int b=2;b<=Math.sqrt(a);b++){
            

            if(a%b==0){
                isprime=false;
            }
            


        }
        if (isprime==true){
            System.out.println(" a prime");
        }
        else{
            System.out.println("not a prime");
        }
    }

    }
}