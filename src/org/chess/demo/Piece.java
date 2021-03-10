package org.chess.demo;

public class Piece {
    private final String name;
    private int x;
    private int y;
    private final boolean isBlack;
    private boolean isSelected = false;
    private boolean isCaptured = false;
    public int oldX;
    public int oldY;
    // public boolean isAlreadyMoved = false;


    public Piece(String name, int x, int y, boolean isBlack, boolean isSelected) {
        this.name = name;
        setX(x);
        setY(y);
        this.oldX = x;
        this.oldY = y;
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
        if (selected){
            oldX = x;
            oldY = y;
        }
        isSelected = selected;
    }

    protected void setOldPos(){
        x = oldX;
        y = oldY;
    }

    public  boolean setPosition(int x, int y){
        return true;
    }


    public boolean isCaptured() {
        return isCaptured;
    }

    public void setCaptured(boolean captured) {
        isCaptured = captured;
    }

   /* public boolean checkIfMovedIsAllowed(int x,int y){

    }*/
}


