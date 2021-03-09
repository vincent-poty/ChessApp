package org.chess.demo.model;

import org.chess.demo.model.Piece;

public class Queen extends Piece {

    public Queen(String name, int x, int y, boolean isblack, boolean isSelected) {
        super(name, x, y, isblack, isSelected);
    }

    @Override
    public boolean setPosition(int x, int y) {
        if (x == this.x || y == this.y) {
            this.x = x;
            this.y = y;
            return true;
        }
        return false;
    }
}
