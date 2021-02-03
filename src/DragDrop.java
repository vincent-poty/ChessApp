import processing.core.PApplet;
import processing.core.PImage;

    public class DragDrop extends PApplet {

        DropableImage dropableImage = new DropableImage(this);

        public void settings(){
            size(600, 600);
        }
        public void setup() {
            background(255);
            noStroke();
            dropableImage = new DropableImage(50, 50, "C:\\Users\\Potyv\\IdeaProjects\\ChessApp\\src\\Images\\Pion.png");
        }

        public void draw() {
            background(255);
            dropableImage.draw();
            dropableImage.updatePosition();
        }


        public void mousePressed() {
            dropableImage.mousePressed();
        }

        public void mouseReleased() {
            dropableImage.mouseReleased();
        }

      /*  public class DropableImage {
            int x;
            int y;
            PImage pImage;
            boolean isDragging;

            DropableImage(int posx, int posy, String fileName) {
                x=posx;
                y=posy;
                pImage = loadImage(fileName);
                pImage.resize(55, 0);
            }

            public void draw() {
                image(pImage, x, y);
            }

            public void mousePressed() {
                if (isMouseOnImage()) {
                    isDragging = true;
                }
            }

            private boolean isMouseOnImage() {
                return mouseX > x &&
                        mouseY > y &&
                        mouseX < x + pImage.width &&
                        mouseY < y + pImage.height;
            }

            public void mouseReleased() {
                isDragging = false;
            }

            public void updatePosition() {
                if (isDragging) {
                    x = mouseX;
                    y = mouseY;
                }
            }
        }*/

    public static void main(String[] args) {
        PApplet.runSketch(new String[]{"Drag and Drop"}, new DragDrop());
    }
}
