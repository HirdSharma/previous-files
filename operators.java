import java.util.*;
public class operators{
    public static int getith(int n,int i){
        int bitmask=(1<<i);
        int jamm=n&bitmask;
        if(jamm==0){
            return 0;
        }else{
            return 1;
        }

    }
    public static int setith(int n,int i){
        int bitmask=1<<i;
        return n|bitmask;
    }
    public static int clrith(int n,int i){
        int bitmask=~(1<<i);
        return n&bitmask;
    }
    public static int updateith(int n,int i,int order){
        if(order==1){
            return setith(n, i);
        }else {
            return clrith(n, i);
        }
    }
    public static int updateith2(int n,int i,int order){
        n=clrith(n, i);
        int bitmask=order<<i;
        return n|bitmask;

    }
    public static int clrlastbits(int n,int i){
        int bitmask=(-1<<i);
        return n&bitmask;
    }
    public static int clrrange(int n,int i,int j){
        int a=((~0)<<(j+1));
        int b=(1<<i)-1;
        int bitmask=a|b;
        return n&bitmask;
    }
    public static void main(String args[]){
        System.out.println(clrrange(15,1,3));
      
    }
    
}