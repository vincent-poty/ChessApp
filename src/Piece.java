public class Piece {
    private final String name;
    private int x;
    private int y;
    private final boolean isblack;
    private boolean isSelected;
    public boolean isCaptured = false;
    // public boolean isAlreadyMoved = false;


    public Piece(String name, int x, int y, boolean isblack, boolean isSelected, boolean isCaptured) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.isblack = isblack;
        this.isSelected = isSelected;
        this.isCaptured = isCaptured;
    }

    public String getName() {

        return name;
    }

    public int getX() {

        return x;
    }

    public int getY() {

        return y;
    }

    public boolean isBlack() {

        return isblack;
    }

    public boolean isSelected() {

        return isSelected;
    }

    public boolean isCaptured() {

        return isCaptured;
    }

    public void setX(int x) {

        this.x = x;
    }

    public void setY(int y) {

        this.y = y;
    }

   /* public boolean checkIfMovedIsAllowed(int x,int y){

    }*/
}


