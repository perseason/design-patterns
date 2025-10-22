package pers.lilpen.patterns.demo.behavioral.iterator;

/**
 * @author : penghuaishun
 * @version : 1.0
 **/
public class BookShelfIterator implements Iterator<Book> {
    private final BookShelf bookShelf;
    private int index = 0;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
    }

    @Override
    public boolean hasNext() {
        return index < bookShelf.getLength();
    }

    @Override
    public Book next() {
        return bookShelf.getBookAt(index++);
    }
}
