package org.chess.demo;

import org.chess.demo.dao.DaoChess;
import org.chess.demo.model.ChessHelper;
import org.chess.demo.model.Piece;
import processing.core.PApplet;

import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Piece> pieces;
        if (args.length ==0){
            ChessHelper chessHelper = new ChessHelper();
            pieces = chessHelper.build();
        } else {
            DaoChess daoChess = new DaoChess();
            pieces = daoChess.fetch();
        }
        PChess p = new PChess(pieces);
        PApplet.runSketch(new String[]{"org.chess.demo.PChess"}, new PChess());
    }
}

