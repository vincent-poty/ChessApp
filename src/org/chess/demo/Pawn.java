package org.chess.demo;

public class Pawn extends Piece{
    
    private boolean Position;

    public Pawn(String name, int x, int y, boolean isblack, boolean isSelected, boolean isCaptured, boolean Position) {
        super(name, x, y, isblack, isSelected, isCaptured);
        this.Position = Position;
    }

    public boolean isPosition() {
        return Position;
    }

   public void setPosition(int x, int y) {
       boolean isAllow = true;
        if ( x != getX() - 1 && x != getX() - 2 ){
            isAllow = false;
        }
        if (x != getX() + 1 && x != getX() +2){
            isAllow = false;
        }
    }
}
