package org.chess.demo;

import org.chess.demo.model.*;
import processing.core.PApplet;

import java.util.ArrayList;
import java.util.List;

public class PChess extends PApplet {

    private boolean isBlackTurn = false;
    private int size = 90;
    private Piece selected = null;
    private String message = "";
    private List<Piece> pieces;

    public PChess() {
        super();
        this.pieces = pieces;
    }

    @Override
    public void settings() {
        this.size(8 * size, 8 * size + 40);
    }

    @Override
    public void draw() {
        background(255);
        drawCases();
        drawPieces();
        drawMessage();
    }

    @Override
    public void mousePressed() {
        int x = mouseX / size;
        int y = mouseY / size;
        for (Piece p : pieces) {
            if (x == p.getX() && y == p.getY()) {
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
                try { p.setPosition(x, y);
                    message ="";
                } catch (InvalidMovementException e) {
                    message = "Mouvement non autorisé";
                }
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
    private void drawMessage(){
        textAlign(LEFT);
        text(message,10, 8 * size + 30);
    }}

