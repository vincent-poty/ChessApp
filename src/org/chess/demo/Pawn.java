package org.chess.demo;


public class Pawn extends Piece {


    public Pawn(String name, int x, int y, boolean isblack, boolean isSelected) {
        super(name, x, y, isblack, isSelected);

    }


    @Override
    public boolean setPosition(int x, int y) {
        int posY = getY() - this.y;
        if (this.x != x){
            return false;
        }
        if (posY != 1 || posY != -1) {
            return false;
        }
        setX(x);
        setY(y);
        return true;
    }
}
