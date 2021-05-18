package org.chess.demo.model;


public class Knight extends Piece {

    public Knight(String name, int x, int y, boolean isblack, boolean isSelected) {
        super(name, x, y, isblack, isSelected);
    }

    @Override
    public void setPosition(int x, int y) throws InvalidMovementException {
        int deltaY = Math.abs(y - this.y);
        int deltaX = Math.abs(x - this.x);
        if ((deltaY == 2 && deltaX == 1) || (deltaX == 2 && deltaY == 1)) {
            this.x = x;
            this.y = y;
        }
        throw new InvalidMovementException();
    }
}
