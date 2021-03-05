package org.chess.demo;

public class Piece {
    private final String name;
    private int x;
    private int y;
    private final boolean isBlack;
    private boolean isSelected = false;
    private boolean isCaptured ;
    // public boolean isAlreadyMoved = false;


    public Piece(String name, int x, int y, boolean isblack, boolean isSelected, boolean isCaptured) {
        this.name = name;
        setX(x);
        setY(y);
        this.isBlack = isblack;
        setSelected(isSelected);
        this.isCaptured = false;
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
/* public boolean setPosition(int x, int y){
        return position;
   }*/

    public boolean isBlack() {

        return isBlack;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
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


