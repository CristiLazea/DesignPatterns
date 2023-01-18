package src;

import lab6_7.Visitee;
import lab6_7.Visitor;

public class Image implements Element, Visitee {
    private String image;

    @Override
    public String toString() {
        return "Image: " + image ;
    }

    @Override
    public void print() {

    }

    public Image (String image) {
        this.image = image;
    }

    @Override
    public void add(Element e) {

    }

    @Override
    public void remove(Element e) {

    }

    @Override
    public Element get(int i) {
        return null;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitImage(this);
    }
}
