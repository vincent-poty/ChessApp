package org.chess.demo;

public class Rook extends Piece{

    
    public Rook(String name, int x, int y, boolean isblack, boolean isSelected) {
        super(name, x, y, isblack, isSelected);
    }

    @Override
    public boolean setPosition(int x, int y) {
      return true;
        }
}
