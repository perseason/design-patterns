package pers.lilpen.patterns.demo.creational.factory;

/**
 * @author : penghuaishun
 * @version : 1.0
 **/
public abstract class Cube {
    protected double length;
    protected double width;
    protected double height;

    public Cube(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public abstract String getColour();

    public abstract String getShape();

    public double getVolume() {
        return length * width * height;
    }

    @Override
    public String toString() {
        return "Cube{" +
                "colour:" + getColour() +
                " shape:" + getShape() +
                " volume:" + getVolume() +
                '}';
    }
}
