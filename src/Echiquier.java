import processing.core.PApplet;

public class Echiquier {
    Piece piece;
    private Piece tourBlanche;

    public Echiquier() {
        piece = new Piece();
    }

    Case[][] cases = new Case[8][8];

   public void Echiquier(){

       int caseWidth = width / nbrColonnes;
       int caseHeight = height / nbrLignes;
       textSize(18);
       textAlign(CENTER, CENTER);
        for(int x = 0; x < 8; ++x) {
            for(int y = 0; y < 8; ++y) {
                    cases [x][y] = new Case(x , y);
                    cases [0][0].piece = tourBlanche;
                    cases [0][1].piece = fouBlanche;
        }

    }
   }

    public void setTourBlanche(Piece tourBlanche) {
        this.tourBlanche = tourBlanche;
    }
}

/*
 if ((x + y) % 2 == 0) {
         fill(227, 228, 194, 55);
         stroke(227, 228, 194, 55);
         rect((x * caseWidth), (0 + y * caseWidth), caseWidth, caseHeight);
         }  else {
         fill( 111,55,55,20);
         stroke( 111,55,55,20);
         rect((x * caseHeight), (0 + y * caseHeight), caseWidth, caseHeight);
         }*/