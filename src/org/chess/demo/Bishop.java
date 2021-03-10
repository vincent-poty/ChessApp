package org.chess.demo;

import org.chess.demo.Piece;

public class Bishop extends Piece{

    public Bishop(String name, int x, int y, boolean isblack, boolean isSelected) {
        super(name, x, y, isblack, isSelected);
    }
    public boolean setPosition(int x, int y){
        int deltaY = Math.abs(y - this.y);
        int deltaX = Math.abs(x - this.x);
        if(deltaY == deltaX){
            this.x = x;
            this.y = y;
            return true;
        }
        return false;
    }
}
