public class methodoverloading{
    public static void main(String args[]){
        calculator calc=new calculator();
        System.out.println(calc.sum(10,280));
        System.out.println(calc.sum((float)10.1,(float)28));
        System.out.println(calc.sum(10,280,88));
    }
}
class calculator{
    int sum(int a,int b){
       return a + b;
    }
    float sum(float a,float b){
        return  a +  b;
    }
    int sum(int a,int b,int c){
        return a+ b+ c;
    }
}