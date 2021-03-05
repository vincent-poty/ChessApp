package org.chess.demo;

public class Pawn extends Piece {

    private boolean isPosition;

    public Pawn(String name, int x, int y, boolean isblack, boolean isSelected, boolean isCaptured, boolean isPosition) {
        super(name, x, y, isblack, isSelected, isCaptured);
        this.isPosition = isPosition;
    }

    public boolean isPosition() {
        return isPosition;
    }

    public void setPosition(boolean isPosition) {
        int PosY = getY();
        if (PosY != getY() - 1) {
            setPosition(false);
        }
        if (PosY != getY() + 1) {
            setPosition(false);
        }
    }
}
