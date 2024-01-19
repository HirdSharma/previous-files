import java.util.*;
public class dmatrix{
    public static int maximum(int matrix[][]){
        int n=matrix.length;
        int m=matrix[0].length;
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]>largest){
                    largest=matrix[i][j];
                }
            }   
        }
        System.out.println("largest element="+largest);
        return largest;
        
    }
    public static void main(String args[]){
        int matrix[][]=new int[3][3];
        int n=matrix.length;
        int m=matrix[0].length;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }   
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();   
        }
        maximum(matrix);      
    }
}