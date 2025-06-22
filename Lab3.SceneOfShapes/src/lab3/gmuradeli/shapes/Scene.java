package lab3.gmuradeli.shapes;

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

}
