package pers.lilpen.patterns.demo.creational.factory;

/**
 * @author : penghuaishun
 * @version : 1.0
 **/
public class RedSphere extends Sphere {

    public RedSphere(double radius) {
        super(radius);
    }

    @Override
    public String getColour() {
        return "red";
    }

    @Override
    public String getShape() {
        return "sphere";
    }
}
