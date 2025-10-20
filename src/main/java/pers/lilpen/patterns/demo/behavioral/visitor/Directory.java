package pers.lilpen.patterns.demo.behavioral.visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author : penghuaishun
 * @version : 1.0
 **/
public class Directory extends Entry {
    private final String name;
    private final List<Entry> dir = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int size = 0;
        for (Entry entry : dir) {
            size += entry.getSize();
        }
        return size;
    }

    @Override
    public Entry add(Entry entry) throws RuntimeException {
        dir.add(entry);
        return this;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public Iterator<Entry> iterator() {
        return dir.iterator();
    }
}
