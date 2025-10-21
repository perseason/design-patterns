package pers.lilpen.patterns.demo.creational.factory;

/**
 * @author : penghuaishun
 * @version : 1.0
 **/
public class ShapeOfRedFactory extends ShapeFactory {

    @Override
    public Sphere createSphere(double radius) {
        return new RedSphere(radius);
    }

    @Override
    public Cube createCube(double length, double width, double height) {
        return new RedCube(length, width, height);
    }
}
