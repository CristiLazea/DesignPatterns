package src;

import lombok.Data;
import lombok.NonNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Data
public class Section implements Element {
    @NonNull
    private String name;

    private List<Element> elements = new ArrayList<>();

    @Override
    public String toString() {
        return  name + '\n' + elements.stream().map(Objects::toString).collect(Collectors.joining("\n"));
    }

    @Override
    public void print() {
        toString();
    }

    @Override
    public void add(Element e) {
        elements.add(e);
    }

    @Override
    public void remove(Element e) {
        elements.remove(e);
    }

    @Override
    public Element get(int i) {

        return elements.get(i);
    }
}
