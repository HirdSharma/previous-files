import java.util.*;
public class ques{
    public static int prof(int arr[]){
        int p=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>=arr[i]){
                    int prof=arr[j]-arr[i];
                    if(prof>p){
                        p=prof;
                    }
                }
                else{
                    return 0;
                }
            }
        }
        return p;
    }
    public static void main(String args[]){
        int arr[]={6,5,4,3,2,1};
        System.out.print("profit="+prof(arr));
    }
}