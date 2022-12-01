package lab2;

public class Paragraph {
    String Name;

    @Override
    public String toString() {
        return Name;
    }

    public Paragraph(String name) {
        Name = name;
    }
}
