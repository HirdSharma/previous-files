public class constructor2{
    public static void main(String args[]){
        alpha a1=new alpha();
        alpha b1=new alpha("hirdesh");
        System.out.println(b1.name);
    }
}
class alpha{
    //non parameterized constuctors
    alpha(){
        System.out.println("constructor is calling");
    }
    String name;
    //parameterized constructors
    alpha(String name){
        this.name=name;
    }

}