package src;

public class Image implements Element{
    private String image;

    @Override
    public String toString() {
        return "Image: " + image ;
    }

    @Override
    public void print() {

    }

    public Image(String image) {
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
}
