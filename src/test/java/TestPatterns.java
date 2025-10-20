import org.junit.Test;
import pers.lilpen.patterns.demo.decorator.*;
import pers.lilpen.patterns.demo.observer.BinaryOutputObserver;
import pers.lilpen.patterns.demo.observer.PrintObserver;
import pers.lilpen.patterns.demo.observer.RandomNumSubject;
import pers.lilpen.patterns.demo.visitor.Directory;
import pers.lilpen.patterns.demo.visitor.File;
import pers.lilpen.patterns.demo.visitor.ListVisitor;

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
}
