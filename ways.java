public class ways{
    public static int waystostand(int n){
        if(n==1||n==2){
            return n;
        }
        int fnm1=waystostand(n-1);
        int fnm2=(n-1)*waystostand(n-2);
        int totways=fnm1+fnm2;
        return totways;
    }
    public static void main(String args[]){
        System.out.println(waystostand(3));
    }
}