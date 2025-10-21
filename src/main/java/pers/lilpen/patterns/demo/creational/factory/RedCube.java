package pers.lilpen.patterns.demo.creational.factory;

/**
 * @author : penghuaishun
 * @version : 1.0
 **/
public class RedCube extends Cube {

    public RedCube(double length, double width, double height) {
        super(length, width, height);
    }

    @Override
    public String getColour() {
        return "red";
    }

    @Override
    public String getShape() {
        return "cube";
    }
}
