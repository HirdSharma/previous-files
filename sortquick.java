//this code is to made an array sorted , in normal cases tc=o(nlogn) and sc=0(1),in worst cases tc=o(n^2).in worst cases array is already
//sorted.
import java.util.*;
public class sortquick{
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void quicksort(int arr[],int si,int ei){//recursion
        if(si>=ei){//base case
            return;
        }
        int pidx=partition(arr,si,ei);//work to do in each step
        quicksort(arr, si, pidx-1);//call for next function
        quicksort(arr, pidx+1, ei);
    }
    public static int partition(int arr[],int si,int ei){//this function is to get index of pivot pt where it is put after arranging 
        // all lesser elements behind and greater element after pivot pt .
        int pivot=arr[ei];// pivot is initially at ending index
        int i=si-1;
        for(int j=si;j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                //swap arr[i]to arr[j]
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp=pivot;
        arr[ei]=arr[i];
        arr[i]=temp;// pivot after each step        elements lesser,,pivot,,,,elements greater
        return i;
    }
    public static void main(String args[]){
        int arr[]={4,6,9,1,3,-3,7};
        quicksort(arr,0, arr.length-1);
        printarr(arr);
    }
}

