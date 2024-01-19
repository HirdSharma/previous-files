public class inheritance{
    public static void main(String args[]){
        fish shark=new fish();
        shark.move();
        animals tiger=new animals();
        shark.calories=90;
        System.out.println(shark.calories);
        dolphin d1=new dolphin();
        d1.gills=4;
        System.out.println(d1.gills);
        System.out.println(d1.calories);
    }
}
class animals{
    void breathes(){
        System.out.println("breathes");
    }
    int calories;
    
    void move(){
        System.out.println("it can move");
    }
}
class fish extends animals{
    void swim(){
        System.out.println("it can swim");
    }
    int fins;
}
class dolphin extends fish{
    int gills;
    void looks(){
        System.out.println("she is gorgeous");
    }
}