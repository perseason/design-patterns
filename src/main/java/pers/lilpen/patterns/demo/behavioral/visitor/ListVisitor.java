package pers.lilpen.patterns.demo.behavioral.visitor;


import org.apache.commons.lang3.StringUtils;

import java.util.Iterator;

/**
 * @author : penghuaishun
 * @version : 1.0
 **/
public class ListVisitor extends Visitor {
    private String curDir = "";

    @Override
    public void visit(File file) {
        System.out.println(StringUtils.join(curDir, "/", file));
    }

    @Override
    public void visit(Directory directory) {
        System.out.println(StringUtils.join(curDir, "/", directory));
        String saveDir = curDir;
        curDir = StringUtils.join(curDir, "/", directory.getName());
        Iterator<Entry> iterator = directory.iterator();
        while (iterator.hasNext()) {
            Entry entry = iterator.next();
            entry.accept(this);
        }
        curDir = saveDir;
    }
}
