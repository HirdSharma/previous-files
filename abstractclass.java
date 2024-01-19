public class abstractclass{
    public static void main(String args[]){
        kangaroo k1=new kangaroo();
        horse h1=new horse();
        h1.eat();
        h1.legs();
        k1.eat();
        k1.legs();
        System.out.println(k1.color);
    }
}
abstract class animals{
    String color;
    animals(){
        System.out.println("constructor animal is called");
        color="green";
    }
    void eat(){
        System.out.println("eats");
    }
    abstract void legs();
}
class horse extends animals{
    void changecolor(){
        color="brown";
    }
    horse(){
        System.out.println("constructor horse is called ");
    }
    void legs(){
        System.out.println("has 4 legs");
    }
}
class kangaroo extends horse{
    void colorchange(){
        color="voilet";
    }
    kangaroo(){
        System.out.println("constructor kangaroo is called");
    }
    void legs(){
        System.out.println("has 2 legs");
    }
}