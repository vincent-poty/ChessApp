package org.chess.demo;

import org.chess.demo.Pawn;
import org.chess.demo.Piece;
import org.chess.demo.Rook;
import processing.core.PApplet;

import java.util.ArrayList;
import java.util.List;

public class PChess extends PApplet {

    private boolean isBlackTurn = false;
    private int size = 100;
    private List<Piece> pieces = new ArrayList<>();

    private void buildPieces() {
        String[] names = {"T", "C", "F", "D", "R", "F", "C", "T"};
        // black
        pieces.add(new Rook("T", 0, 0, true, false));
        pieces.add(new Knight("C", 1, 0, true, false));
        pieces.add(new Bishop("F", 2, 0, true, false));
        pieces.add(new Queen("D", 3, 0, true, false));
        pieces.add(new King("R", 4, 0, true, false));
        pieces.add(new Bishop("F", 5, 0, true, false));
        pieces.add(new Knight("C", 6, 0, true, false));
        pieces.add(new Rook("T", 7, 0, true, false));
        // second line
        for (int x = 0; x < 8; ++x) {
            pieces.add(new Pawn("P", x, 1, true, false));
        }
        //white
        pieces.add(new Rook("T", 0, 7, false, false));
        pieces.add(new Knight("C", 1, 7, false, false));
        pieces.add(new Bishop("F", 2, 7, false, false));
        pieces.add(new Queen("D", 3, 7, false, false));
        pieces.add(new King("R", 4, 7, false, false));
        pieces.add(new Bishop("F", 5, 7, false, false));
        pieces.add(new Knight("C", 6, 7, false, false));
        pieces.add(new Rook("T", 7, 7, false, false));
        //fourd line
        for (int x = 0; x < 8; ++x) {
            pieces.add(new Pawn("P", x, 6, false, false));
        }
    }

    @Override
    public void settings() {
        buildPieces();
        this.size(8 * size, 8 * size);
    }

    @Override
    public void draw() {
        drawCases();
        drawPieces();
    }

    @Override
    public void mousePressed() {
        int x = mouseX / size;
        int y = mouseY / size;
        for (Piece p : pieces) {
            if (x == p.getX() && y == p.getY() && p.isBlack() == isBlackTurn) {
                p.setSelected(true);
                break;
            }
        }
    }

    @Override
    public void mouseReleased() {
        int x = mouseX / size;
        int y = mouseY / size;
        for (Piece p : pieces) {
            if (p.isSelected()) {
                p.setPosition(x, y);
                isBlackTurn = !isBlackTurn;
            }
            p.setSelected(false);
        }
    }

    private void drawPieces() {
        textAlign(CENTER, CENTER);
        textSize(size * 0.4f);
        noStroke();
        for (Piece p : pieces) {
            drawPiece(p);
        }
    }

    private void drawCases() {
        noFill();
        for (int x = 0; x < 8; ++x) {
            for (int y = 0; y < 8; ++y) {
                if ((x + y) % 2 == 0) fill(255);
                else fill(0);
                rect((x * size), (y * size), size, size);
            }
        }
    }

    private void drawPiece(Piece piece) {
        float topX = piece.isSelected() ? mouseX - size / 2 : size * piece.getX();
        float topY = piece.isSelected() ? mouseY - size / 2 : size * piece.getY();
        int circleColor = piece.isBlack() ? color(165, 42, 42) : color(244, 226, 198);
        int textColor = piece.isBlack() ? color(255) : color(0);
        fill(circleColor);
        ellipse(topX + 0.5f * size, topY + size * 0.5f, size * 0.8f, size * 0.8f);
        fill(textColor);
        text(piece.getName(), topX, topY - size * 0.4f / 7f, size, size);
    }

    public static void main(String[] args) {
        PApplet.runSketch(new String[]{"org.chess.demo.PChess"}, new PChess());
    }
}