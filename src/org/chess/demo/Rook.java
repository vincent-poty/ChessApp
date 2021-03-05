package org.chess.demo;

public class Rook extends Piece{

    private boolean isAllow;

    public Rook(String name, int x, int y, boolean isblack, boolean isSelected, boolean isCaptured, boolean isAllow) {
        super(name, x, y, isblack, isSelected, isCaptured);
        this.isAllow = isAllow;
    }

    public boolean isAllow() {
        return isAllow;
    }

    public void setAllow(int x, int y) {
        if (x != getX() && y != getY()){
            setAllow(x,y);
        }
    }
}
