package pers.lilpen.patterns.demo.structural.decorator;

import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;

/**
 * @author : penghuaishun
 * @version : 1.0
 **/
public class Milk extends CoffeeDecorator {

    public Milk(Coffee coffee) {
        super(coffee);
    }

    @Override
    public BigDecimal getCost() {
        return coffee.getCost().add(new BigDecimal("2"));
    }

    @Override
    public String getDescription() {
        return StringUtils.join(coffee.getDescription(), " add milk");
    }
}
