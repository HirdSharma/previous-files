public class diagonalsum{
    public static int diagonaladd(int matrix[][]){
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            sum+=matrix[i][i];
            if(i!=matrix.length-1-i){
                sum+=matrix[i][matrix.length-1-i];
            }
        }
        return sum;
    }
    public static void srcmatrix(int matrix[][],int key){
        int k=matrix.length-1;
        int t=0;
        while(k>=0&&t<=matrix[0].length-1){
            if(key>matrix[k][t]){
                t++;
            }else if(key==matrix[k][t]){
                System.out.println("index is"+k+","+t+" ");
                break;
            }else{
                k--;
            }
        }
        
    }
    public static void main(String args[]){
        int matrix[][]={{1,2,3},{5,6,7}};
        printMatrix(matrix);   
    }
}