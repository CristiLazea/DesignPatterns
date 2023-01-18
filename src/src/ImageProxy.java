package src;

import lab6_7.Visitee;
import lab6_7.Visitor;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ImageProxy implements Picture, Element, Visitee {

    String url;
    Dimension dim;
    Image image;
    List<Element> elements = new ArrayList<>();


    public Image loadImage(){
        if(image == null){
            image = new Image(url);
        }

        return image;
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

    @Override
    public String url () {
        return null;
    }

    public ImageProxy(String url) {
        this.url = url;
    }

    @Override
    public Dimension dim() {
        return null;
    }

    @Override
    public PictureContent content() {
        return null;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitImageProxy(this);
    }
}
