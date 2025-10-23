package pers.lilpen.patterns.demo.structural.adapter;

import org.apache.commons.lang3.StringUtils;

/**
 * @author : penghuaishun
 * @version : 1.0
 **/
public class Banner {
    private final String string;

    public Banner(String string) {
        this.string = string;
    }

    public void showWithParen() {
        System.out.println(StringUtils.join("(", string, ")"));
    }

    public void showWithAster() {
        System.out.println(StringUtils.join("*", string, "*"));
    }
}
