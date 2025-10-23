package pers.lilpen.patterns.demo.structural.adapter;

/**
 * @author : penghuaishun
 * @version : 1.0
 **/
public class PrintBanner extends Banner implements Print {
    public PrintBanner(String string) {
        super(string);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
