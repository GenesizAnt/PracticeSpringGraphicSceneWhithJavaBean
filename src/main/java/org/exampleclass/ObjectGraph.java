package org.exampleclass;

public abstract class ObjectGraph {

    String color;
    Coordinates coordinates;
    int radius;

    public ObjectGraph() {

    }

    abstract String draw();

    public ObjectGraph(String color, Coordinates coordinates) {
        this.color = color;
        this.coordinates = coordinates;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
