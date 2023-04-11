
import processing.core.PApplet;

public class Main extends PApplet {



    public static void main(String[] args) {
        PApplet.main("Main");//fix
    }

    public void settings(){
        size(600, 600);
    }
    public void setup() {

        rectMode(CENTER);
        frameRate(2);
    }

    public void draw() {
        background(226, 137, 240);

        drawRectangle(width/2, height/2, 500);
        drawCircle(width/ 2, height / 2, 200);

    }

    public void drawCircle(float a, float b, float radius) {
        stroke(0);
        noFill();
        ellipse(a, b, radius, radius);
        if (radius > 2) {
            drawCircle(a + radius / 2, b, radius / 2);
            drawCircle(a - radius / 2, b, radius / 2);

        }
        if (a % 2 == 0) {
            fill(random (256),random (256),random (256));
        } else {
            fill(0, 100, 200);

        }
    }

        public void drawRectangle( int x, int y,int size){
            rect(x, y, size, size);
            if (size > 10) {
                drawRectangle(x - size / 2, y, size / 2);
                drawRectangle(x + size / 2, y, size / 2);
            }
        }
    }




