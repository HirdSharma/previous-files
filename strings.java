import java.util.*;
public class strings{

    public static boolean ispalindrome(String str){
        for(int i=0;i<str.length()/2;i++){
            int n=str.length();
            if(str.charAt(i)!=str.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
    public static String substring(String str,int st,int en){
        String substr="";
        for(int i=st;i<en;i++){
            substr+=str.charAt(i);
        }
        return substr;
    }
    public static void main(String args[]){
        String str[]={"papaya","mango","lichi","coconut","pinapple","guava"};
        String largest=str[0];
        for(int i=1;i<str.length;i++){
            if(largest.compareTo(str[i])<0){
                largest=str[i];
            }

        }
        System.out.println(largest);
        //String str="hirdesh";
        //System.out.println(substring(str,1,4));

    }
}
