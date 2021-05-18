package org.chess.demo.model;

public abstract class Piece {
    protected final String name;
    protected int x;
    protected int y;
    protected final boolean isBlack;
    protected boolean isSelected = false;
    protected boolean isCaptured = false;

    public Piece(String name, int x, int y, boolean isBlack, boolean isSelected) {
        this.name = name;
        setX(x);
        setY(y);
        this.isBlack = isBlack;
        this.isSelected = isSelected;
    }

    public String getName() {

        return name;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    public boolean isBlack() {

        return isBlack;
    }

    public boolean isSelected() {

        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }


    public abstract void setPosition(int x, int y) throws InvalidMovementException;

    public boolean isCaptured() {
        return isCaptured;
    }



    public void setCaptured(boolean captured) {
        isCaptured = captured;
    }
}


