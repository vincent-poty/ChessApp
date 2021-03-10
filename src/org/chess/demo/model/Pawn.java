package org.chess.demo.model;


import org.chess.demo.model.Piece;

public class Pawn extends Piece {


    public Pawn(String name, int x, int y, boolean isblack, boolean isSelected) {
        super(name, x, y, isblack, isSelected);

    }

    @Override
    public boolean setPosition(int x, int y) {
        int deltaY = (y - this.y);
        if (x != this.x) return false;
        if(isBlack() == true && deltaY != 1) {
            return false;
        }
        if(isBlack() == false && deltaY != -1) {
            return false;
        }
        this.y = y;
        return false;
    }
}
