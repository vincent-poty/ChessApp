package org.chess.demo;


public class Pawn extends Piece {



    public Pawn(String name, int x, int y, boolean isblack, boolean isSelected, boolean isCaptured, boolean isPosition) {
        super(name, x, y, isblack, isSelected, isCaptured,isPosition);

    }


    //  @Override
  public boolean setPosition(int x, int y) {
        int PosY = getY();
        if (PosY != x - 1 && isSelected()) {
            return false;
        }
        else if (PosY != x + 1 && isSelected()) {
            return false;
        }
        setX(x);
        setY(y);
        return true;
    }
}
