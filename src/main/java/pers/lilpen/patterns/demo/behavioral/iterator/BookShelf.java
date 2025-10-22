package pers.lilpen.patterns.demo.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : penghuaishun
 * @version : 1.0
 **/
public class BookShelf implements Aggregate<Book> {
    private final List<Book> books = new ArrayList<>();

    public Book getBookAt(int index) {
        return books.get(index);
    }

    public void appendBook(Book book) {
        books.add(book);
    }

    public int getLength() {
        return books.size();
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }
}
