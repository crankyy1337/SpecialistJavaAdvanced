package lab3.gmuradeli.shapes;

public class Coords {

    //переменные
    private int x,y;

    //геттеры-сеттеры
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
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
}
