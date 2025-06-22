package lab3.gmuradeli.shapes;

import java.sql.SQLOutput;

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

}
