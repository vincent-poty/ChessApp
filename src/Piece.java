public class Piece {
    String name;
    boolean isBlack;
    boolean isCaptured;

    public Piece(String name, boolean isBlack, boolean isCaptured) {
        this.name = name;
        this.isBlack = isBlack;
        this.isCaptured = isCaptured;
    }
    Piece tourBlanche = new Piece("Tour", false, false);
    Piece chevalBlanche = new Piece("Cheval", false, false);
    Piece fouBlanche = new Piece("Fou", false, false);
    Piece dameBlanche = new Piece("Dame", false, false);
    Piece roiBlanche = new Piece("Roi", false, false);
    Piece pionBlanche = new Piece("Pion", false, false);

    Piece tourNoir = new Piece("Tour", true, false);
    Piece chevalNoir = new Piece("Cheval", true, false);
    Piece fouNoir = new Piece("Fou", true, false);
    Piece dameNoir = new Piece("Dame", true, false);
    Piece roiNoir = new Piece("Roi", true, false);
    Piece pionNoir = new Piece("Pion", true, false);
    public static void main(String[] args) {



        for (Piece item: ) System.out.println();
    }
}


