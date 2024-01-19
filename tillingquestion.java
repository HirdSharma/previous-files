public class tillingquestion{
    public static int tillingproblem(int n){//2*nplot size
       //base class
       if(n==0||n==1){
        return 1;
       }
       //vertical choice
       int nm1=tillingproblem(n-1);
       //horizontal choice
       int nm2=tillingproblem(n-2);
       //total ways
       int totalways=nm1+nm2;
       return totalways;

    }
    public static void main(String args[]){
        System.out.println(tillingproblem(4));
    }
}