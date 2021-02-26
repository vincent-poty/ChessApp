import processing.core.PImage;

public class Piece {
    final String name;
    private int x;
    private int y;
    final boolean isBlack;
    public boolean isSelected = false;
    public boolean isAlreadyMoved = false;

    public Piece(String name, int x, int y, boolean isBlack) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.isBlack = isBlack;
    }

    public String getName() {
        return name;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isBlack() {
        return isBlack;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

   /* public boolean checkIfMovedIsAllowed(int x,int y){

    }*/
}


