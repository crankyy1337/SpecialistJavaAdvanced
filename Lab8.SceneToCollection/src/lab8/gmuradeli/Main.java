package lab8.gmuradeli;

import lab8.gmuradeli.shapes.Circle;
import lab8.gmuradeli.shapes.Point;
import lab8.gmuradeli.shapes.Scene;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Scene scene = new Scene();

        scene.add(new Point(10, 20));
        scene.add(new Circle(10, 20, 2.4));
        scene.add(new Point(2,3,"Green"));
        scene.add(new Circle(10, 20, 2.4, "Red"));

        scene.draw();

        scene.save("../scene.json");
        System.out.println("Scene saved.");
    }
}