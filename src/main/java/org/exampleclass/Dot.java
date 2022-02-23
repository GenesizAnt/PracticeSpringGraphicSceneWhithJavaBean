package org.exampleclass;

public class Dot extends ObjectGraph {


    public Dot(String color, Coordinates coordinates) {
        super(color, coordinates);
    }


    @Override
    String draw() {
        System.out.printf("Нарисовали Точку цвет-%s с координатами X-%s и Y-%s\n", color, coordinates.getCoordinatesX(), coordinates.getCoordinatesY());
        return null;
    }
}
