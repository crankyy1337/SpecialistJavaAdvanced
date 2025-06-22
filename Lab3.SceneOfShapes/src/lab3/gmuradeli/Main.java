package lab3.gmuradeli;

import lab3.gmuradeli.shapes.*;


public class Main {
    public static void main(String[] args) {

        var scene = new Scene();

        scene.add(new Point(10, 20));
        scene.add(new Point(2,3,"Green"));
        scene.add(new Circle(10, 20, 2.4));
        scene.add(new Circle(10, 20, 2.4, "Red"));

        scene.draw();

    }
}
