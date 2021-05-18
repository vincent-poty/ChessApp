package org.chess.demo.model;


public class Pawn extends Piece {

    public Pawn(String name, int x, int y, boolean isblack, boolean isSelected) {
        super(name, x, y, isblack, isSelected);
    }

    @Override
    public void setPosition(int x, int y) throws InvalidMovementException {
        if (x != this.x) throw new InvalidMovementException();
        int deltaY = (y - this.y);
        if ((isBlack() && deltaY == 1) ||
                (isBlack() && this.y == 1 && deltaY == 2) ||
                (!isBlack() && deltaY == -1) ||
                (!isBlack() && this.y == 6 && deltaY == -2)) {
            this.x = x;
            this.y = y;
        } else {
            throw new InvalidMovementException();
        }
    }
}
