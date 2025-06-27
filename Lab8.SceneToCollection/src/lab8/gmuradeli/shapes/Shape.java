package lab8.gmuradeli.shapes;

public abstract class Shape implements Comparable<Shape> {

    //константы и переменные
    public static final String DEFAULT_COLOR = "Black";
    private String color;

    //геттеры-сеттеры
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //конструкторы
    public Shape() {
        this.color = DEFAULT_COLOR;
    }
    public Shape(String color) {
        setColor(color);
    }

    //методы
    public abstract void draw();

    public abstract double distance();

    @Override
    public int compareTo (Shape o) {
        return (int)Math.signum(this.distance() - o.distance());
    }

}
