//question1)apply merge sort to sort an array of strings(assume all characters in strings are in lower case) i/p arr={"sun","earth","mars","mercury"}
//o/p=arr={"earth","mars","mercury","sun"}
import java.util.*;
public class mergesortque1{
    public static String[] mergesort(String[] arr,int lo,int hi){
        if(lo==hi){
            String[] A = { arr[lo] };
            return A;
        }
        int mid=lo+((hi-lo)/2);
        String[] arr1=mergesort(arr, lo, mid);
        String[] arr2=mergesort(arr, mid+1, hi);
        String[] arr3=merge(arr1,arr2);
        return arr3;
    }
    public static String[] merge(String[] arr1,String[] arr2){
        int m=arr1.length;
        int n=arr2.length;
        String[] arr3=new String[m+n];
        int idx=0;
        int i=0;
        int j=0;
        while(i<m && j<n){
            if(isalphabeticallysmaller(arr1[i],arr2[j])==true){
                arr3[idx]=arr1[i];
                idx++;
                i++;

            }
            else{
                arr3[idx]=arr2[j];
                idx++;
                j++;
            }
        }
        while(i<m){
            arr3[idx]=arr1[i];
            idx++;
            i++;

        }
        while(j<n){
            arr3[idx]=arr2[j];
            idx++;
            j++;
        }
        return arr3;
    }
    //compare func is + when str1>str2,- when str1<str2,,,we used it acc to que
    public static boolean isalphabeticallysmaller(String str1,String str2){
        if(str1.compareTo(str2)<0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        String[] arr={"sun","earth","mars","mercury"};
        String[] a=mergesort(arr, 0, arr.length-1);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+",");
        }
    }

}