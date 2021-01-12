import processing.core.PApplet;

import java.awt.image.ColorModel;

public class Echiquier extends PApplet {

    private int nbrColonnes = 8;
    private int nbrLignes = 8;

    public Echiquier() {
    }

    public void settings() {
        this.size(480, 480);
    }

    public void setup() {
        textSize(15.0F);
        textAlign(3, 3);


    }

    public void draw(){
        drawChess();
    }
    public void drawChess() {
        for(int x = 0; x < nbrLignes; ++x) {
            for(int y = 0; y < nbrLignes; ++y) {
                if ((x + y) % 2 == 0) {
                    fill(227, 228, 194);
                    stroke(227, 228, 194);
                    rect((x * (width / 8)), (0 + y * 60), (width / 8), (height / 8));
                } else {
                    fill( 111,55,55);
                    stroke( 111,55,55);
                    rect((x * (width / 8)), (0 + y * 60), (width / 8), (height / 8));
                }
            }

        }

    }

    public static void main(String[] args) {
        PApplet.runSketch(new String[]{"Echiquier"}, new Echiquier());
    }
}

