import processing.core.PApplet;
import processing.core.PImage;

public class DropableImage {

        DragDrop dragDrop;

        public DropableImage(DragDrop dragDrop) {
            this.dragDrop = dragDrop;

        }

        int x;
        int y;
        PImage pImage;
        boolean isDragging;

        DropableImage(int posx, int posy, String fileName) {
            x=posx;
            y=posy;
            pImage = dragDrop.loadImage(fileName);
            pImage.resize(55, 0);
        }

        public void draw() {
            dragDrop.image(pImage, x, y);
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
                int deltaX = pImage.width - 20;
                int deltaY = pImage.height - 20;
                x = mouseX - deltaX;
                y = mouseY - deltaY;
            }
        }
    }

