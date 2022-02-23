package org.exampleclass;

public class Circle extends ObjectGraph {

    public Circle(String color, Coordinates coordinates, int radius) {
        super(color, coordinates);
        this.radius = radius;
    }

    @Override
    String draw() {
        System.out.printf("Нарисовали Круг цвет-%s с координатами X-%s и Y-%s и радиусом %s\n", color, coordinates.getCoordinatesX(), coordinates.getCoordinatesY(), radius);
        return null;
    }
}
