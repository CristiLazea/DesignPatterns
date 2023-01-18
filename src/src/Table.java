package src;

import lab6_7.Visitee;
import lab6_7.Visitor;

public class Table implements Element, Visitee {
    private String table;

    public Table(String table1) {
        table = table1;
    }

    @Override
    public String toString() {
        return "Table: "+ table;
    }

    @Override
    public void print() {
        System.out.println(table);
    }

    @Override
    public void add(Element e) {

    }

    @Override
    public void  remove(Element e) {

    }

    @Override
    public Element get(int i) {
        return null;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitTable(this);
    }
}
