public class recursive{
    public static void printdec(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        printdec(n-1);
    }
    public static void printinc(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printinc(n-1);
        System.out.print(n+" ");
    }
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        int f=n*factorial(n-1);
        return f;

    }
    public static int sum(int n){
        if(n==0){
            return 0;
        }
        int s=n+sum(n-1);
        return s;
    }
    public static int fabonacci(int n){
        if(n==1||n==0){
            return n;
        }
        int fabnm1=fabonacci(n-1);
        int fabnm2=fabonacci(n-2);
        int fabn=fabnm1+fabnm2;
        return fabn;
    }
    public static boolean sorting(int arr[],int i){
        if (i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return sorting(arr, i+1);
    }
    public static int firstocc(int arr[],int key,int i){
        if(arr[i]==key){
            return i;
        }
        if(i==arr.length-1){
            return -1;
        }
        return firstocc(arr, key, i+1);
    }
    public static int lastocc(int arr[],int key,int i){
        if(arr[i]==key){
            return i;
        }
        if(i==0){
            return -1;
        }
        return lastocc(arr, key, i-1);
    }
    public static void main(String args[]){
        int arr[]={1,2,4,4,6,5,4,8};
        int i=arr.length-1;
        int key=4;
        System.out.println(lastocc(arr, key, i));

    }
}