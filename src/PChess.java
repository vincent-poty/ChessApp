import processing.core.PApplet;

import java.util.ArrayList;
import java.util.List;

public class PChess extends PApplet {

    int size = 100;
    List<Piece> pieces = buildPieces();

    private List buildPieces(){
        List pieces = new ArrayList<>();
        String[] names = {"T", "C", "F", "D", "R", "F", "C", "T"};
        for (int x = 0; x < 8; ++x){
            pieces.add(new Piece(names[x], x, 0, true));
        }
        for (int x = 0; x < 8; ++x){
           pieces.add(new Piece("P", x, 1, true));
        }
        for (int x = 0; x < 8; ++x){
            pieces.add(new Piece(names[x], x, 7, false));
        }
        for (int x = 0; x < 8; ++x){
            pieces.add(new Piece("P", x, 6, false));
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
            if (piece.isBlack)  fill(165, 42, 42);
            else fill(244, 226, 198);
            ellipse( (piece.x * size) + 50, (piece.y * size) + 50 , size * 0.8f, size * 0.8f);
           /* if (Piece.isBlack) fill(255);
            else fill(0);*/
          if (piece.isBlack) fill(255, 255, 255);
            else fill(0, 0, 0);
            text(piece.name, piece.x * 100, piece.y * 100, size, size);
        }


    public static void main(String[] args) {
        PApplet.runSketch(new String[]{"PChess"}, new PChess());
    }
}

