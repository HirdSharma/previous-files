public class pattern{
    public static void main(String args[]){
        int n=123456789;
        
        while(n>0){
            int lst=n%10;
            System.out.print(lst);
            n=n/10;
        }
        
    }
}