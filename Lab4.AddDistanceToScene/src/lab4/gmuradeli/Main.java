package lab4.gmuradeli;

import lab4.gmuradeli.shapes.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
            Scene scene = new Scene();

            scene.add(new Point(10, 20));
            scene.add(new Circle(10, 20, 2.4));
            scene.add(new Point(2,3,"Green"));
            scene.add(new Circle(10, 20, 2.4, "Red"));

            scene.sort();
            scene.draw();

    }
}