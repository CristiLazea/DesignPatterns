package lab2;

public class Image {
    private String name;

    @Override
    public String toString() {
        return name;
    }

    public Image(String name) {
        this.name = name;
    }
}
