package lab6.gmuradeli;

import lab6.gmuradeli.shapes.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Scene scene = new Scene();

        scene.add(new Point(10, 20));
        scene.add(new Circle(10, 20, 2.4));
        scene.add(new Point(2,3,"Green"));
        scene.add(new Circle(10, 20, 2.4, "Red"));


        scene.save("../scene.json");
        System.out.println("Scene saved.");
    }
}