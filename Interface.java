public class Interface {
    public static void main(String[] args) {
        Queen q1=new Queen();
        q1.moves();
    }
}

interface ChessPlayer{
    void moves();
}
  
class Queen implements ChessPlayer{
    public void moves() {
        System.out.println("up,down,right,left,diagonal -> (in all direction)");
    }
}

class King implements ChessPlayer{
    public void moves() {
        System.out.println("up,down,right,left,diagonal -> (by one step)");
    }
}

class Rook implements ChessPlayer{
    public void moves() {
        System.out.println("up,down,right,left");
    }
}