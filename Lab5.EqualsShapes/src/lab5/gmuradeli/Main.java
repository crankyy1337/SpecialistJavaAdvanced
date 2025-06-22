package lab5.gmuradeli;

import lab5.gmuradeli.shapes.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scene scene = new Scene();

        scene.add(new Point(10, 20));
        scene.add(new Circle(10, 20, 2.4));
        scene.add(new Point(2,3,"Green"));
        scene.add(new Circle(10, 20, 2.4, "Red"));

        Circle c1 = new Circle(10, 20, 2.5);
        Circle c2 = new Circle(10, 20, 2.5, "Red");

        Point p1 = new Point(2, 4);
        Point p2 = new Point(2, 4);

        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));

        System.out.println(c1.equals(null));
        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(new Circle(10, 20, 2.5)));

    }
}