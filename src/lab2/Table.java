package lab2;

public class Table {
    private String name;

    @Override
    public String toString() {
        return name;
    }

    public Table(String name) {
        this.name = name;
    }
}
