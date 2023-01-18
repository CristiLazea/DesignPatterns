package src;

import lab5.AlignStrategy;
import lab6_7.Visitee;
import lab6_7.Visitor;

public class Paragraph implements Element, Visitee {
    private String description;

    public Paragraph(String paragraph1) {
        description = paragraph1;
    }

    @Override
    public String toString() {
        return "Paragraph: "+ description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public void print() {
        System.out.println(this);
    }

    @Override
    public void add(Element e) {

    }

    @Override
    public void remove(Element e) {

    }

    @Override
    public Element  get(int i) {
        return null;
    }


    public void setAlignStrategy(AlignStrategy align) {
        description = align + description;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitParagraph(this);
    }
}
