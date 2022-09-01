public class ExOfInterfaces{
    public static void main(String args[]){
    Queen q= new Queen();
    q.moves();
    }
}

interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){ //need to make public, otherwise it will be a default function
        System.out.println("up,down,left,right,diagonal");
    }
}
class Rook implements ChessPlayer{
    public void moves(){ //need to make public, otherwise it will be a default function
        System.out.println("up,down,left,right");
    }
}
class King implements ChessPlayer{
    public void moves(){ //need to make public, otherwise it will be a default function
        System.out.println("up,down,left,right,diagonal (by 1 step)");
    }
}