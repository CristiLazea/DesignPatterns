package src;

public class Paragraph implements Element {
    private String description;

    public Paragraph(String paragraph1) {
        description = paragraph1;
    }

    @Override
    public String toString() {
        return "Paragraph: "+ description;
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
    public Element get(int i) {
        return null;
    }
}
