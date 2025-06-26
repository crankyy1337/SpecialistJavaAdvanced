package lab6.gmuradeli.shapes;

import java.util.Objects;

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

    @Override
    public double distance() {
        return coords.distance();
    }

    @Override
    public Point clone() {
        return new Point(getX(), getY(), getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getX(), getY(), getColor());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;

        Point p = (Point)obj;

        return this.getX() == p.getX() &&
                this.getY() == p.getY() &&
                this.getColor().equals(p.getColor());
    }

}
