package pers.lilpen.patterns.demo.behavioral.visitor;

import java.util.Iterator;

/**
 * @author : penghuaishun
 * @version : 1.0
 **/
public abstract class Entry implements Element {
    public abstract String getName();

    public abstract int getSize();

    public Entry add(Entry entry) throws RuntimeException {
        throw new RuntimeException();
    }

    public Iterator<Entry> iterator() throws RuntimeException {
        throw new RuntimeException();
    }

    public String toString() {
        return getName() + " (" + getSize() + ")";
    }
}
