package lab3.gmuradeli.shapes;

public abstract class Shape {

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

}
