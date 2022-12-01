package lab2;

import java.util.ArrayList;
import java.util.List;

public class SubChapter {
    private String name;
    private List<Paragraph> paragraphs = new ArrayList<>();
    private List<Image> images = new ArrayList<>();
    private List<Table> tables = new ArrayList<>();

    public SubChapter(String name) {
        this.name = name;
    }

    public void createNewParagraph(String name) {
        Paragraph par = new Paragraph(name);
        paragraphs.add(par);
    }

    @Override
    public String toString() {
        return "SubChapter: " + name + '\n' +
                "Paragraph: " + paragraphs.toString() +'\n'+
                "Image with name:" + images.toString() + '\n'+
                "Table with title:" + tables.toString() + '\n';
    }

    public void createNewImage(String name) {
        Image img = new Image(name);
        images.add(img);
    }

    public void createNewTable(String name) {
        Table tb = new Table(name);
        tables.add(tb);
    }

    public void print() {
        System.out.println(this.toString());
    }
}
