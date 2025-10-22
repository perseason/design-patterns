package pers.lilpen.patterns.demo.behavioral.iterator;

public interface Aggregate<T> {
    Iterator<T> iterator();
}
