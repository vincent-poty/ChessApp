import processing.core.PApplet;

public class PChess extends PApplet {
    Echiquier echiquier;

    public PChess() {
        echiquier = new Echiquier();
    }


    int nbrColonnes = 8;
    int nbrLignes = 8;
    public void settings() {
        this.size(600, 600);
    }

    public void setup() {
        textSize(15.0F);
        textAlign(3, 3);
    }

    public void draw(){
        drawChess();
        drawPieces();
    }


    public static void main(String[] args) {
        PApplet.runSketch(new String[]{"PChess"}, new PChess());
    }
}

