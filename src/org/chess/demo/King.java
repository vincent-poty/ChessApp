package org.chess.demo;


public class King extends Piece{

    public King(String name, int x, int y, boolean isblack, boolean isSelected) {
        super(name, x, y, isblack, isSelected);
    }
    
    @Override
    public boolean setPosition(int x, int y){
        if((y - this.y) != 1 || (x - this.x) != 1) {
            return false;
        }
        setPosition(x,y);
        return true;
    }
}
