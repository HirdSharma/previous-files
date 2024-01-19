import java.util.*;
public class pairs{
public static void printpairs(int numbers[]){
    for(int i=0;i<numbers.length;i++){
        int start=i;
        for(int j=i+1;j<numbers.length;j++){
            int last=j;
            System.out.println("("+numbers[i]+","+numbers[j]+")");
        }
        System.out.println();
    }

}
public static void main(String args[]){
    int numbers[]={1,2,3,4,5};
    printpairs(numbers);
}
}