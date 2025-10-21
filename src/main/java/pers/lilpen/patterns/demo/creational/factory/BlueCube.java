package pers.lilpen.patterns.demo.creational.factory;

/**
 * @author : penghuaishun
 * @version : 1.0
 **/
public class BlueCube extends Cube {
    public BlueCube(double length, double width, double height) {
        super(length, width, height);
    }

    @Override
    public String getColour() {
        return "blue";
    }

    @Override
    public String getShape() {
        return "cube";
    }
}
