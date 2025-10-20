package pers.lilpen.patterns.demo.structural.decorator;

import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;

/**
 * @author : penghuaishun
 * @version : 1.0
 **/
public class Sugar extends CoffeeDecorator {

    public Sugar(Coffee coffee) {
        super(coffee);
    }

    @Override
    public BigDecimal getCost() {
        return coffee.getCost().add(new BigDecimal("0.5"));
    }

    @Override
    public String getDescription() {
        return StringUtils.join(coffee.getDescription(), " add sugar");
    }
}
