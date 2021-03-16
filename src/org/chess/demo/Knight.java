package org.chess.demo;


public class Knight extends Piece {

    public Knight(String name, int x, int y, boolean isblack, boolean isSelected) {
        super(name, x, y, isblack, isSelected);
    }

    @Override
    public boolean setPosition(int x, int y) {
        int deltaY = Math.abs(y - this.y);
        int deltaX = Math.abs(x - this.x);
        if ((deltaY == 2 && deltaX == 1) || (deltaX == 2 && deltaY == 1)) {
            this.x = x;
            this.y = y;
            return true;
        }
        return false;
    }

}
