package org.chess.demo;


import org.chess.demo.Piece;

public class Pawn extends Piece {


    public Pawn(String name, int x, int y, boolean isblack, boolean isSelected) {
        super(name, x, y, isblack, isSelected);

    }

    @Override
    public boolean setPosition(int x, int y) {
        if (x != this.x) return false;
        int deltaY = (y - this.y);
        if((isBlack() && deltaY == 1) ||
                (isBlack() && this.y == 1 && deltaY == 2 ) ||
                (!isBlack() && deltaY == -1) ||
                (!isBlack() && this.y == 6 && deltaY == -2 )){
            this.x = x;
            this.y = y;
            return true;
        }
        return false;
    }
}
