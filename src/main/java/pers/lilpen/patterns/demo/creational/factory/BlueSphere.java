package pers.lilpen.patterns.demo.creational.factory;

/**
 * @author : penghuaishun
 * @version : 1.0
 **/
public class BlueSphere extends Sphere {

    public BlueSphere(double radius) {
        super(radius);
    }

    @Override
    public String getColour() {
        return "blue";
    }

    @Override
    public String getShape() {
        return "sphere";
    }
}
