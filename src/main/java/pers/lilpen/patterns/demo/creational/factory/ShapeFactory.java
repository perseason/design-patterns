package pers.lilpen.patterns.demo.creational.factory;

/**
 * @author : penghuaishun
 * @version : 1.0
 **/
public abstract class ShapeFactory {

    public abstract Sphere createSphere(double radius);

    public abstract Cube createCube(double length, double width, double height);
}
