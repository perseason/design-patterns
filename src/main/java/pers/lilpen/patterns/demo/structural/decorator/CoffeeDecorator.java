package pers.lilpen.patterns.demo.structural.decorator;

import java.math.BigDecimal;

/**
 * @author : penghuaishun
 * @version : 1.0
 **/
public abstract class CoffeeDecorator implements Coffee {
    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public abstract BigDecimal getCost();

    @Override
    public abstract String getDescription();
}
