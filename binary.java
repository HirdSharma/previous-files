import java.util.*;
public class binary{
    public static void reverse(int numbers[]){
        int n=numbers.length;
        int start=0;
        int end=n-1;
        while(end>start){
            int temp;
            numbers[end]=temp;
            numbers[end]=numbers[start];
            numbers[start]=temp;
            start++;
            end--;
        }
        

        }

    }
    public static void main(String args[]){
        int numbers[]={1,2,3,4,5,6,7};
        reverse(numbers);

    }
