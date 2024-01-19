//this code is to find index of target in sorted array which is rotated about pivot pt,for ex)1,2,3,4,5 when rotated about 3
// it becomes 4,5,1,2,3      .   this we have 3 as pivot pt
import java.util.*;
public class searchidx{
    public static int Search(int arr[],int target,int si,int ei){
        if(si>ei){
            return -1;
        }
        int mid=si+((ei-si)/2);
        if(arr[mid]==target){
            return mid;
        }
        if(arr[si]<=arr[mid]){
            if(arr[si]<=target && target<=arr[mid]){
                return Search(arr, target, si, mid-1);
            }
            else{
                return Search(arr, target, mid+1, ei);
            }
        }
        else{
            if(arr[mid]<=target && target<=arr[ei]){
                return Search(arr, target, mid+1, ei);
            }
            else{
                return Search(arr, target, si, mid-1);
            }
        }
    }
    public static void main(String[] args){
        int arr[]={4,5,6,7,1,2,3};
        int target=3;
        int targetidx=Search(arr,target,0,arr.length-1);
        System.out.print("index of target element "+ targetidx);
    }
}