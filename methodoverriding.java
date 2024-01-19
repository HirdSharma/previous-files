public class methodoverriding{
    public static void main(String args[]){
        deer d=new deer();
        d.eat();
    }
}
class animals{
    void eat(){
        System.out.println("eats anything");
    }
}
class deer extends animals{
    void eat(){
        System.out.println("eats grass");
    }
}