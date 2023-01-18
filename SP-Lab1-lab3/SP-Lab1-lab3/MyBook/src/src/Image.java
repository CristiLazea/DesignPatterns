package src;

import lombok.Data;
import lombok.NonNull;

@Data
public class Image implements Element{
    @NonNull
    private String image;

    @Override
    public String toString() {
        return "Image: " + image ;
    }

    @Override
    public void print() {

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
