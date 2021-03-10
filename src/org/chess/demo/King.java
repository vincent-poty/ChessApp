package org.chess.demo;


public class King extends Piece{

    public King(String name, int x, int y, boolean isblack, boolean isSelected) {
        super(name, x, y, isblack, isSelected);
    }
    
    @Override
    public boolean setPosition(int x, int y){
        int deltaY = Math.abs(y - this.y);
        int deltaX = Math.abs(x - this.x);
        if((deltaY == 1) || deltaX == 1){
            this.x = x;
            this.y = y;
            return true;
        }
        return false;
    }
}
