import java.util.*;
public class dectobin{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int decnum=sc.nextInt();
        int pow=0;
        int bin=0;
        while(decnum>0){
        int rem=decnum%2;
        bin=bin+rem*(int)Math.pow(10, pow);
        decnum=decnum/2;

        pow++;
        }
        System.out.println(bin);

    }
}