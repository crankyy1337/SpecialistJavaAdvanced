package lab4.gmuradeli.shapes;

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
}
