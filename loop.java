import java.util.*;
public class loop{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("enter no");
            int n=sc.nextInt();
            if(n%10==0){
                continue;
            }
            System.out.println(n+" here is your entered no");
            
        }

    }
}