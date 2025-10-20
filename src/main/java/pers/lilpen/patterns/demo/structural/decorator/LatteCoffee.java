package pers.lilpen.patterns.demo.structural.decorator;

import java.math.BigDecimal;

/**
 * @author : penghuaishun
 * @version : 1.0
 **/
public class LatteCoffee implements Coffee {

    @Override
    public BigDecimal getCost() {
        return BigDecimal.valueOf(10);
    }

    @Override
    public String getDescription() {
        return "Latte Coffee";
    }
}
