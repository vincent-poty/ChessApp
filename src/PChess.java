import processing.core.PApplet;

import java.util.ArrayList;
import java.util.List;

public class PChess extends PApplet {

    int size = 100;
    List<Piece> pieces = new ArrayList<>();

    private void initPieces() {
        String[] names = {"T", "C", "F", "D", "R", "F", "C", "T"};
        // first line
        for (int x = 0; x < 8; ++x) {
            pieces.add(new Piece(names[x], x, 0, true));
        }
        // second line
        for (int x = 0; x < 8; ++x) {
            pieces.add(new Piece("P", x, 1, true));
        }
        //third line
        for (int x = 0; x < 8; ++x) {
            pieces.add(new Piece(names[x], x, 7, false));
        }
        //fourd line
        for (int x = 0; x < 8; ++x) {
            pieces.add(new Piece("P", x, 6, false));
        }
    }

    public void settings() {
        initPieces();
        this.size(8 * size, 8 * size);
    }

    public void draw() {
        drawCases();
        drawPieces();
    }

    public void mousePressed() {
        int x = mouseX /size;
        int y = mouseY / size;
        for (Piece p : pieces) {
            if (x == p.getX() && y == p.getY()) {
                p.isSelected = true;
                p.setX(x);
                p.setY(y);
               // p.setX( x + ((x * size) + (size / 2)));
             //   p.setY( y + ((y * size) + (size / 2)));
            } else {
                p.isSelected = false;
            }
        }
    }

    public void mouseReleased() {
        //int x = mouseX / size;
        // int y = mouseY / size;
        for (Piece p : pieces) {
            if (p.isSelected == true) {
                p.setX(mouseX / size);
                p.setY(mouseY / size);
                p.isSelected = false;
            }
        }
    }

    public void mouseDragged() {
        // int x = mouseX;
        //int y = mouseY;
        for (Piece p : pieces) {
            if (p.isSelected == true) {
                p.setX(mouseX);
                p.setY(mouseY);
            }
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
        if (piece.isSelected = false) {
            if (piece.isBlack) fill(165, 42, 42); //brun
            else fill(244, 226, 198);             // beige
            ellipse((piece.getX() * size) + (size * 0.5f), (piece.getY() * size) + (size * 0.5f), size * 0.8f, size * 0.8f);
            if (piece.isBlack) fill(255);
            else fill(0);
            text(piece.getName(), piece.getX() * size, piece.getY() * size, size, size);
        } else {
            if (piece.isBlack) fill(165, 42, 42); //brun
            else fill(244, 226, 198);             // beige
            //ellipse((piece.x ) + (size * 0.5f), (piece.y ) +(size * 0.5f), size * 0.8f, size * 0.8f);
            ellipse(piece.getX() + (size * 0.5f), piece.getY() + (size * 0.5f), size * 0.8f, size * 0.8f);
            if (piece.isBlack) fill(255);
            else fill(0);
            text(piece.getName(), piece.getX() - (size * 0.5f), piece.getY() - (size * 0.5f), size, size);
        }
    }

    public static void main(String[] args) {
        PApplet.runSketch(new String[]{"PChess"}, new PChess());
    }
}

