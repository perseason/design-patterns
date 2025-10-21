package pers.lilpen.patterns.demo.creational.factory;

/**
 * @author : penghuaishun
 * @version : 1.0
 **/
public class ShapeOfBlueFactory extends ShapeFactory {

    @Override
    public Sphere createSphere(double radius) {
        return new BlueSphere(radius);
    }

    @Override
    public Cube createCube(double length, double width, double height) {
        return new BlueCube(length, width, height);
    }
}
