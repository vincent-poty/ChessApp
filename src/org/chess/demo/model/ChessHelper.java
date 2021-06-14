package org.chess.demo.model;

import java.util.ArrayList;
import java.util.List;

public class ChessHelper {
    public List<Piece> build(){
        List<Piece> pieces = new ArrayList<>();
        build.add(new Rook("T", 0, 0, true, false));
        build.add(new Knight("C", 1, 0, true, false));
        build.add(new Bishop("F", 2, 0, true, false));
        build.add(new Queen("D", 3, 0, true, false));
        build.add(new King("R", 4, 0, true, false));
        build.add(new Bishop("F", 5, 0, true, false));
        build.add(new Knight("C", 6, 0, true, false));
        build.add(new Rook("T", 7, 0, true, false));
        // second line
        for (int x = 0; x < 8; ++x) {
            build.add(new Pawn("P", x, 1, true, false));
        }
        //white
        build.add(new Rook("T", 0, 7, false, false));
        build.add(new Knight("C", 1, 7, false, false));
        build.add(new Bishop("F", 2, 7, false, false));
        build.add(new Queen("D", 3, 7, false, false));
        build.add(new King("R", 4, 7, false, false));
        build.add(new Bishop("F", 5, 7, false, false));
        build.add(new Knight("C", 6, 7, false, false));
        build.add(new Rook("T", 7, 7, false, false));
        //fourd line
        for (int x = 0; x < 8; ++x) {
            build.add(new Pawn("P", x, 6, false, false));
        }

    }
}
