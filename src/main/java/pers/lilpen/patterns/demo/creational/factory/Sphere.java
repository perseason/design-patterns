package pers.lilpen.patterns.demo.creational.factory;

/**
 * @author : penghuaishun
 * @version : 1.0
 **/
public abstract class Sphere {
    protected double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public abstract String getColour();

    public abstract String getShape();

    public double getVolume() {
        return (4.0 / 3) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public String toString() {
        return "Sphere{" +
                "colour:" + getColour() +
                " shape:" + getShape() +
                " volume:" + getVolume() +
                '}';
    }
}
