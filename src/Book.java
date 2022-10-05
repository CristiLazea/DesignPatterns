package lab1;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String name;
    private String text;
    private List<String>paragraph;
    private List<String> images;
    private List<String> tables;

    public Book(String name) {
        super();
        this.name=name;
        this.paragraph =  new ArrayList<String>();
        this.images =  new ArrayList<String>();
        this.tables =  new ArrayList<String>();

    }

    public Book(String name,String text, List<String> images, List<String> tables) {
        super();
        this.name=name;
        this.text = text;
        this.images = images;
        this.tables = tables;
    }

    public void createNewParagraph(String text) {
        this.paragraph.add(text);
    }
    public void createNewImage(String text) {
        this.images.add(text);
    }
    public void createNewTable(String text) {
        this.tables.add(text);
    }
    public void print() {
        System.out.print(this.toString());
    }

    @Override
    public String toString() {
        return "Book [name=" + name + ", text=" + text + ", paragraph=" + paragraph + ", images=" + images + ", tables="
                + tables + "]";
    }


}
