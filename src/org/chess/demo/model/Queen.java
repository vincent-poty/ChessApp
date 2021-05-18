package org.chess.demo.model;


public class Queen extends Piece {

    public Queen(String name, int x, int y, boolean isblack, boolean isSelected) {
        super(name, x, y, isblack, isSelected);
    }

    @Override
    public void setPosition(int x, int y) throws InvalidMovementException {
        int deltaY = Math.abs(y - this.y);
        int deltaX = Math.abs(x - this.x);
        if (deltaY == deltaX) {
            this.x = x;
            this.y = y;
        }
        if (x == this.x || y == this.y) {
            this.x = x;
            this.y = y;
        }
        throw new InvalidMovementException();
    }
}
