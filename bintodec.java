import java.util.*;
public class bintodec{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int binnum=sc.nextInt();
        int pow=0;
        int decimal=0;
        while(binnum>0){

        int ld=binnum%10;
        decimal=decimal+ld*(int)Math.pow(2, pow);
        binnum=binnum/10;
        pow++;
        }
        System.out.println(decimal);

    }
}