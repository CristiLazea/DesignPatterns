package src;

import lab6_7.Visitee;
import lab6_7.Visitor;

public class TableOfContents implements Element, Visitee {
    String something = "adi";

    @Override
    public void print() {

    }

    public TableOfContents(String something) {
        this.something = something;
    }

    @Override
    public void add(src.Element e) {

    }

    @Override
    public void remove(src.Element e) {

    }

    @Override
    public  src.Element get(int i) {
        return null;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitTableOfContent(this);
    }
}
