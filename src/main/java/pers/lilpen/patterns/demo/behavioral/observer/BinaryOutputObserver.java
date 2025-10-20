package pers.lilpen.patterns.demo.behavioral.observer;

/**
 * @author : penghuaishun
 * @version : 1.0
 **/
public class BinaryOutputObserver implements Observer{
    @Override
    public void update(Subject subject) {
        if (subject instanceof RandomNumSubject) {
            int number = ((RandomNumSubject) subject).getNumber();
            System.out.println("Binary Output: " + Integer.toBinaryString(number));
        }
    }
}
