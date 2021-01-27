import processing.core.PApplet;

import java.util.ArrayList;
import java.util.List;

public class PChess extends PApplet {

    int size = 100;
    List pieces = buildPieces();

    private List buildPieces(){
        List pieces = new ArrayList();
        String[] names = {"T", "C", "F", "D", "R", "F", "C", "T"};
        for (int x = 0; x < 8; ++x){
            pieces.add(new Piece(names[x], x, 1, true));
        }
        for (int i; i < 8; ++i){
           pieces.add(new Piece("P", i, 1, true));
        }
        return pieces;
    }


    public void settings() {
        this.size(8 * size, 8 * size);
    }


    public void draw(){

        drawCases();
        drawPieces();
    }

    private void drawPieces(){
        textAlign(CENTER, CENTER);
        textSize(size * 0.4f);
        noStroke();
        for (Piece p: pieces) {
            drawPiece(p);
        }
    }
    private void drawCases(){
        noFill();
        for(int x = 0; x < 8; ++x) {
            for(int y = 0; y < 8; ++y) {
                if ((x + y) % 2 == 0) fill(255);
                else fill(0);
                rect((x * size), (y * size), size, size);
            }
        }
    }
    private void drawPiece(Piece piece){
            if (Piece.isBlack)  fill(165, 42, 42);
            else fill(244, 226, 198);
            ellipse(size * 0.5f, size * 0.5f, size * 0.8f, size * 0.8f);
            if (Piece.isBlack) fill(255);
            else fill(0);
            text(piece.name, 0, 0, size, size);
        }


    public static void main(String[] args) {
        PApplet.runSketch(new String[]{"PChess"}, new PChess());
    }
}

