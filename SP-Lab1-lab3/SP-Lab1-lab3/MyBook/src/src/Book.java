package src;

import lombok.NonNull;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Book extends Section {
    private Author author;
    private List<Element> elements = new ArrayList<>();

    public void addAuthor(Author rpGheo) {
        author = rpGheo;
    }

    public Book(@NonNull String name) {
        super(name);
    }

    public void addContent(Element e) {
        elements.add(e);
    }

    public void print() {
        System.out.println("Book: "+ getName()
                +"\n\nAuthors:\n"+author
                +"\n" + elements.stream().map(Element::toString).collect(Collectors.joining("\n")));

    }
}
