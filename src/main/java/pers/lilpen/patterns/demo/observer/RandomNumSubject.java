package pers.lilpen.patterns.demo.observer;

/**
 * @author : penghuaishun
 * @version : 1.0
 **/
public class RandomNumSubject extends Subject {
    private int number;

    public void generateRandomNum() {
        this.number = (int) (Math.random() * 100);
        notifyObservers();
    }

    public int getNumber() {
        return this.number;
    }
}
