import java.util.*;
public class projectfunction{
public static int product(int a,int b){
    int product=a*b;
    return product;
}
public static int factorial(int n){
    int facto=1;
    
    for(int i=1;i<=n;i++){
        facto=facto*i;

    }
    return facto;
}
public static int binocoeff(int n,int r){
    int a=factorial(n);
    int b=factorial(r);
    int c=factorial(n-r);
    int binocoeff=a/(b*c);
    return binocoeff;
}
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int r=sc.nextInt();
    System.out.println(binocoeff(n, r));
}
}