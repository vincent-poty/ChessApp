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

  /* public boolean setPosition(int x, int y) {
       boolean isAllow = true;
        if ( y != getY() - 1 && y != getY() - 2 ){
            isAllow = false;
        }
        if (y != getY() + 1 && y != getY() +2){
            isAllow = false;
        }
    }*/
}
