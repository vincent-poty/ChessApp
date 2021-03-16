package org.chess.demo;


public class Queen extends Piece {

    public Queen(String name, int x, int y, boolean isblack, boolean isSelected) {
        super(name, x, y, isblack, isSelected);
    }

    @Override
    public boolean setPosition(int x, int y) {
        int deltaY = Math.abs(y - this.y);
        int deltaX = Math.abs(x - this.x);
        if (deltaY == deltaX) {
            this.x = x;
            this.y = y;
            return true;
        }
        if (x == this.x || y == this.y) {
            this.x = x;
            this.y = y;
            return true;
        }
        return false;
    }
}
