package pers.lilpen.patterns.demo.behavioral.visitor;

/**
 * @author : penghuaishun
 * @version : 1.0
 **/
public interface Element {
    void accept(Visitor visitor);
}
