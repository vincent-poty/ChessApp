package org.chess.demo;

public abstract class Piece {
    private final String name;
    private int x;
    private int y;
    private final boolean isBlack;
    private boolean isSelected = false;
    private boolean isCaptured ;
    private boolean isPosition;
    // public boolean isAlreadyMoved = false;


    public Piece(String name, int x, int y, boolean isBlack, boolean isSelected, boolean isCaptured, boolean isPosition) {
        this.name = name;
        setX(x);
        setY(y);
        this.isBlack = isBlack;
        this.isSelected = isSelected;
        this.isCaptured = isCaptured;
        this.isPosition = isPosition;
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

    public boolean isPosition() {
        return isPosition;
    }

    public abstract boolean setPosition(int x, int y) {

    }

    //  public boolean setPosition(int x, int y);

    public boolean isCaptured() {
        return isCaptured;
    }

    public void setCaptured(boolean captured) {
        isCaptured = captured;
    }

   /* public boolean checkIfMovedIsAllowed(int x,int y){

    }*/
}


