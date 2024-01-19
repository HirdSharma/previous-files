public class printbinstr{
    public static void binstr(int n,int lp,String str){
        //base case
        if(n==0){
            System.out.println(str);
            return;
        }
        //kaam lp=0
        //lp=1
        if(lp==0){
            binstr(n-1, 1, str+"1");
            binstr(n-1, 0, str+"0");
        }else{
            binstr(n-1, 0, str+"0");
        }
    }
    public static void main(String args[]){
        String str="";
        System.out.println(binstr(3, 0, str));

    }
}