public class interfaces{
    public static void main(String args[]){
        queen q1=new queen();
        q1.moves();
        beer b1=new beer();
        b1.eat();
        b1.character();
    }
}
interface chessplayer{
    void moves();
}
class king implements chessplayer{
    public void moves(){
        System.out.println("can move 1 step in all 4 direction");
    }
}
class queen implements chessplayer{
    public void moves(){
        System.out.println("can move int all 4 direction and diagonal by steps as many as possible ");
    }
}
class rook implements chessplayer{
    public void moves(){
        System.out.println("can move in all 4 direction by steps as many as possible");
    }
}
//multiple interferences example
interface herbi{
    void eat();
}
interface carni{
    void eat();
}
interface omni{
    void character();
}
class beer implements herbi,carni,omni{
    public void eat(){
        System.out.println("can eat both");
    }
    public void character(){
        System.out.println("have omnivorous nature");
    }
}