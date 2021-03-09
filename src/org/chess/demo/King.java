package org.chess.demo;

import org.chess.demo.Piece;

public class King extends Piece{

    public King(String name, int x, int y, boolean isblack, boolean isSelected) {
        super(name, x, y, isblack, isSelected);
    }
    
    @Override
    public boolean setPosition(int x, int y){


        setX(x);
        setY(y);
        return true;
    }
}
