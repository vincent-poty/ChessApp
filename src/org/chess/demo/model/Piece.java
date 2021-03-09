package org.chess.demo.model;

public class Piece {
    private final String name;
    protected int x;
    protected int y;
    private final boolean isBlack;
    protected boolean isSelected ;
    protected boolean isCaptured = false;
    // public boolean isAlreadyMoved = false;


    public Piece(String name, int x, int y, boolean isBlack, boolean isSelected) {
        this.name = name;
        this.x = x;
        this.y = y;
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

    public  boolean setPosition(int x, int y){
        this.x = x;
        this.y = y;
        return true;
    }

}


