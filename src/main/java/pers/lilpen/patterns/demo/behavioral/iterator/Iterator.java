package pers.lilpen.patterns.demo.behavioral.iterator;

public interface Iterator<T> {
    boolean hasNext();

    T next();
}
