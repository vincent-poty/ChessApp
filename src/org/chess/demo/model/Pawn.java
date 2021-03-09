package org.chess.demo.model;


import org.chess.demo.model.Piece;

public class Pawn extends Piece {


    public Pawn(String name, int x, int y, boolean isblack, boolean isSelected) {
        super(name, x, y, isblack, isSelected);

    }


    @Override
    public boolean setPosition(int x, int y) {
        if (x != this.x) return false;
        if(isBlack() == true && (y - this.y) != 1) {
            return false;
        }
        if(isBlack() == false && (y - this.y) != -1) {
            return false;
        }
        this.y = y;
        return true;
    }
}
