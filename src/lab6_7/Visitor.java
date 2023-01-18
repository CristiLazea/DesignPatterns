package lab6_7;

import src.*;

public interface Visitor<T> {
    public void visitBook(Book b);
    public void visitSection(Section s);
    public void visitTableOfContent(TableOfContents t);
    public void visitParagraph(Paragraph p);
    public void visitImageProxy(ImageProxy i);
    public void visitImage(Image i);
    public void visitTable(Table i);


}
