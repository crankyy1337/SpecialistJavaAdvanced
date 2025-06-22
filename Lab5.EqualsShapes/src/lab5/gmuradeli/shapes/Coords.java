package lab5.gmuradeli.shapes;

import java.util.Objects;

public class Coords {

    //переменные
    private int x,y;
    private double distance;
    private boolean actualDistance = false;

    //геттеры-сеттеры
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
        actualDistance = false;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
        actualDistance = false;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    //конструкторы
    public Coords() {
        this(0, 0);
    }

    public Coords(int x, int y) {
        setX(x);
        setY(y);
    }

    //методы
    @Override
    public String toString() {
        return String.format("(%d, %d)", getX(), getY());
    }

    public double distance() {
        if (!actualDistance) {
            distance = Math.sqrt(getX()*getX() + getY()*getY());
            actualDistance = true;
        }
        return distance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Coords(getX(), getY());
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass())
            return false;
        Coords other = (Coords) obj;
        return x == other.x && y == other.y;
    }
}
