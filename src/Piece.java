import processing.core.PApplet;

public class Piece {
    String name;
    boolean isBlack;
    boolean isCaptured;

    public Piece(String name, boolean isBlack, boolean isCaptured) {
        this.name = name;
        this.isBlack = isBlack;
        this.isCaptured = isCaptured;
    }

    @Override
    public String toString() {
        return "Piece{" +
                "name='" + name + '\'' +
                ", isBlack=" + isBlack +
                ", isCaptured=" + isCaptured +
                '}';
    }
    public static void main(String[] args) {
        Piece[] pieces = {
                new Piece("tour", false, false),
                new Piece("cheval", false,false),
                new Piece("fou", false, false),
                new Piece("dame", false, false),
                new Piece("roi", false, false),
                new Piece("fou", false, false),
                new Piece("cheval", false, false),
                new Piece("tour", false, false),
                new Piece("pion", false, false),
                new Piece("pion", false, false),
                new Piece("pion", false, false),
                new Piece("pion", false, false),
                new Piece("pion", false, false),
                new Piece("pion", false, false),
                new Piece("pion", false, false),
                new Piece("pion", false, false),
                new Piece("pion", true, false),
                new Piece("pion", true, false),
                new Piece("pion", true, false),
                new Piece("pion", true, false),
                new Piece("pion", true, false),
                new Piece("pion", true, false),
                new Piece("pion", true, false),
                new Piece("pion", true, false),
                new Piece("tour", true, false),
                new Piece("cheval", true,false),
                new Piece("fou", true, false),
                new Piece("dame", true, false),
                new Piece("roi", true, false),
                new Piece("fou", true, false),
                new Piece("cheval", true, false),
                new Piece("tour", true, false)
        };
        for (Piece item : pieces) System.out.println(item);
    }
}


