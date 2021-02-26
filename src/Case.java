import processing.core.PApplet;

import java.nio.channels.Pipe;

public class Case {
    char rank; // 1 à 8
    char column; // a à h
    Piece piece;

    public Case(int x, int y) {
        this.rank = (char) ('0' + x);
        this.column = (char) ('a' + y);
    }

    // indique si case est noir
    public boolean isBlack() {
        return (getX() + getY()) % 2 == 1; // case 1à est blanche
    }

    public int getX() {
        return rank - '1'; //-1 car rank est un carractère.
    }

    public int getY() {
        return column - 'a';
    }
}
