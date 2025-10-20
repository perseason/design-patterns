package pers.lilpen.patterns.demo.structural.decorator;

import java.math.BigDecimal;

/**
 * @author : penghuaishun
 * @version : 1.0
 **/
public class BlackCoffee implements Coffee {

    @Override
    public BigDecimal getCost() {
        return BigDecimal.valueOf(5);
    }

    @Override
    public String getDescription() {
        return "Black Coffee";
    }
}
