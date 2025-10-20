package pers.lilpen.patterns.demo.observer;

/**
 * @author : penghuaishun
 * @version : 1.0
 **/
public class PrintObserver implements Observer {
    @Override
    public void update(Subject subject) {
        if (subject instanceof RandomNumSubject) {
            int number = ((RandomNumSubject) subject).getNumber();
            System.out.println("Print Output: " + number);
        }
    }
}
