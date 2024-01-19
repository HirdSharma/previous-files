import java.util.*;
public class linearsearch{
    public static int linearfind(int numbers[],int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static int largestof(int numbers[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>largest){
                largest=numbers[i];
            }
            else{
                largest=-1;
            }
            

        }
        return largest;
    }
    public static void main(String args[]){
        int numbers[]={2,3,4,6,8,9};
        int key=2;
        //int index=linearfind(numbers, key);
        //if(index==-1){
          //  System.out.println("not found");
        //}else{
          //  System.out.println("key is at index:"+ index);
        System.out.println(largestof(numbers));  
        }
    }
