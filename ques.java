public class que0{
    public static int prof(int arr[]){
        int p=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;i<arr.length;j++){
                if(arr[j]>arr[i]){
                    int prof=arr[j]-arr[i];
                    if(prof>p){
                        p=prof;
                    }
                }
            }
        }
        return p;
    }
    public static void main(String args[]){
        int arr[]={4,3,5,6,1};
        System.out.print("profit="+prof(arr));
    }
}