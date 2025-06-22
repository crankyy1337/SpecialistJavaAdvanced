package lab4.gmuradeli.shapes;

import java.util.Arrays;

public class Scene {

    //переменные
    public static final int MAX_SIZE = 5;
    private Shape[] shapes = new Shape[MAX_SIZE];
    private int shapesCounter = 0;

    //методы
    public boolean add(Shape shape) {
        if (shapesCounter < MAX_SIZE) {
            shapes[shapesCounter++] = shape;
            return true;
        }
        return false;
    }

    public void draw() {
        for (int i = 0; i < shapesCounter; i++)
            shapes[i].draw(); //полиморфизм!!!!!!
    }

    public void sort() {
        Arrays.sort(shapes, 0, shapesCounter);
    }

}
