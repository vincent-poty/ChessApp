package org.chess.demo;


public class Pawn extends Piece {


    public Pawn(String name, int x, int y, boolean isblack, boolean isSelected) {
        super(name, x, y, isblack, isSelected);

    }

    @Override
    public boolean setPosition(int x, int y) {
        int deltaY = Math.abs (y - this.oldY);
        if (x != this.oldX) return false;
        if(deltaY != 1) {
            return false;
        }
        this.y = y;
        this.x = x;
        return true;
    }
}
