package org.chess.demo.model;


public class Rook extends Piece {

    public Rook(String name, int x, int y, boolean isblack, boolean isSelected) {
        super(name, x, y, isblack, isSelected);
    }

    @Override
    public void setPosition(int x, int y) throws InvalidMovementException {
        if (x == this.x || y == this.y) {
            this.x = x;
            this.y = y;
        }
        throw new InvalidMovementException();
    }
}