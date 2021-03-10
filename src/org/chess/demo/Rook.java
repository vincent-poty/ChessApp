package org.chess.demo;


public class Rook extends Piece {

    public Rook(String name, int x, int y, boolean isblack, boolean isSelected) {
        super(name, x, y, isblack, isSelected);
    }

    @Override
    public boolean setPosition(int x, int y) {
        if (x == this.x || y == this.y) {
            this.x = x;
            this.y = y;
            return true;
        }
        return false;
    }
}