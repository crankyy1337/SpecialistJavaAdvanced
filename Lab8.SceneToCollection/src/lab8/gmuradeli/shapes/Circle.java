package lab8.gmuradeli.shapes;

import java.util.Objects;

public class Circle extends Shape {

    //переменные
    private Coords center;
    private double r;

    //геттеры-сеттеры
    public int getX() {
        return center.getX();
    }

    public void setX(int x) {
        center.setX(x);
    }

    public int getY() {
        return center.getY();
    }

    public void setY(int y) {
        center.setY(y);
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        if (r < 0)
            throw new IllegalArgumentException();
        this.r = r;
    }

    //конструкторы
    public Circle(int x, int y, double r) {
        this(x,y,r, DEFAULT_COLOR);
    }

    public Circle(int x, int y, double r, String color) {
        super(color);
        center = new Coords(x, y);
        setR(r);
    }

    //методы
    @Override
    public void draw() {
        System.out.printf("Cirle %s; radius: %.2f; color: %s\n",
                center, getR(), getColor());
    }
    @Override
    public double distance() {
        return center.distance();
    }

    @Override
    public Circle clone() {
        return new Circle(getX(), getY(), getR(), getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getX(), getY(), getR(), getColor());
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;
        if (obj == null) return false;
        if (Circle.class != obj.getClass()) return false;

        Circle c = (Circle)obj;

        return this.getX() == c.getX() &&
                this.getY() == c.getY() &&
                this.getR() == c.getR() &&
                this.getColor().equals(c.getColor());
    }

}
