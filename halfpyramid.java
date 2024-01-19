import java.util.*;
public class halfpyramid{
    public static void main(String args[]){
        int n=9;
        for(int line=1;line<=n;line++){
            for(int number=1;number<=line;number++){
                System.out.print(number);
            }
            System.out.println();
        }
    }
}