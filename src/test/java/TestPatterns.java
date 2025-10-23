import org.junit.Test;
import pers.lilpen.patterns.demo.behavioral.iterator.Book;
import pers.lilpen.patterns.demo.behavioral.iterator.BookShelf;
import pers.lilpen.patterns.demo.behavioral.iterator.Iterator;
import pers.lilpen.patterns.demo.behavioral.observer.BinaryOutputObserver;
import pers.lilpen.patterns.demo.behavioral.observer.PrintObserver;
import pers.lilpen.patterns.demo.behavioral.observer.RandomNumSubject;
import pers.lilpen.patterns.demo.behavioral.visitor.Directory;
import pers.lilpen.patterns.demo.behavioral.visitor.File;
import pers.lilpen.patterns.demo.behavioral.visitor.ListVisitor;
import pers.lilpen.patterns.demo.creational.factory.ShapeOfBlueFactory;
import pers.lilpen.patterns.demo.creational.factory.ShapeOfRedFactory;
import pers.lilpen.patterns.demo.structural.adapter.Banner;
import pers.lilpen.patterns.demo.structural.adapter.PrintBanner;
import pers.lilpen.patterns.demo.structural.decorator.*;

/**
 * @author : penghuaishun
 * @version : 1.0
 **/
public class TestPatterns {

    @Test
    public void testDecorator() {
        Coffee blackCoffee = new BlackCoffee();
        CoffeeDecorator decoratedCoffee = new Milk(blackCoffee);
        System.out.println("Cost: " + decoratedCoffee.getCost());
        System.out.println("Description: " + decoratedCoffee.getDescription());

        Coffee latteCoffee = new LatteCoffee();
        latteCoffee = new Sugar(latteCoffee);
        latteCoffee = new Sugar(latteCoffee);
        System.out.println("Cost: " + latteCoffee.getCost());
        System.out.println("Description: " + latteCoffee.getDescription());
    }

    @Test
    public void testVisitor() {
        Directory root = new Directory("root");
        Directory var = new Directory("var");
        Directory downloads = new Directory("downloads");
        Directory log = new Directory("log");
        Directory tmp = new Directory("tmp");
        root.add(var).add(downloads).add(log).add(tmp);
        File anime = new File("anime.mp4", 1024);
        downloads.add(anime);
        root.accept(new ListVisitor());
    }

    @Test
    public void testObserver() {
        BinaryOutputObserver binaryOutputObserver = new BinaryOutputObserver();
        PrintObserver printObserver = new PrintObserver();
        RandomNumSubject randomNumberSubject = new RandomNumSubject();
        randomNumberSubject.addObserver(binaryOutputObserver);
        randomNumberSubject.addObserver(printObserver);
        for (int i = 0; i < 10; i++) {
            randomNumberSubject.generateRandomNum();
        }
    }

    @Test
    public void testAbstractFactory() {
        ShapeOfRedFactory shapeOfRedFactory = new ShapeOfRedFactory();
        ShapeOfBlueFactory shapeOfBlueFactory = new ShapeOfBlueFactory();
        System.out.println(shapeOfRedFactory.createSphere(20.0).toString());
        System.out.println(shapeOfBlueFactory.createSphere(15.0).toString());
        System.out.println(shapeOfBlueFactory.createCube(10.0, 12.0, 14.0).toString());
        System.out.println(shapeOfRedFactory.createCube(1, 2, 3).toString());
    }

    @Test
    public void testIterator() {
        BookShelf bookShelf = new BookShelf();
        bookShelf.appendBook(new Book("Java Programming1"));
        bookShelf.appendBook(new Book("Java Programming2"));
        bookShelf.appendBook(new Book("Java Programming3"));
        bookShelf.appendBook(new Book("Java Programming4"));
        Iterator<Book> iterator = bookShelf.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println(book.getName());
        }
    }

    @Test
    public void testAdapter() {
        Banner banner = new PrintBanner("abc");
        banner.showWithParen();
        banner.showWithAster();
    }
}
