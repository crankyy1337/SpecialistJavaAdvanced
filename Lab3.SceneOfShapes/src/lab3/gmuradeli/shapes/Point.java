package lab3.gmuradeli.shapes;

public class Point extends Shape {

    //переменные
    private Coords coords;

    //геттеры-сеттеры
    public int getX() {
        return coords.getX();
    }

    public int getY() {
        return coords.getY();
    }

    public void setX(int x) {
        coords.setX(x);
    }

    public void setY(int y) {
        coords.setY(y);
    }

    //конструкторы
    public Point(int x, int y) {
        this(x, y, DEFAULT_COLOR);
    }

    public Point(int x, int y, String color) {
        super(color);
        coords = new Coords(x, y);
    }

    //методы
    @Override
    public void draw() {
        System.out.printf("Point %s; color: %s\n",
                coords, getColor());
    }
}
