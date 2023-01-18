package src;


import lab6_7.Visitee;
import lab6_7.Visitor;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Section implements Element, Visitee {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Section(String name) {

    }

    public Section(List<Element> elements, String name) {
        this.elements = elements;
        this.name = name;
    }

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
    public Element  get(int i) {

        return elements.get(i);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitSection(this);
    }
}
