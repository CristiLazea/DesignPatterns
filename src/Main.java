public class Main {
    public static void main(String[] args) {
        src.Book noapteBuna = new src.Book("Noapte buna, copii!");
        src.Author rpGheo = new src.Author("Radu pavel Gheo");
        noapteBuna.addAuthor(rpGheo);


        src.Section cap1 = new src.Section("Capitolul 1");
        src.Section cap11 = new src.Section("Capitolul 1.1");
        src.Section cap111 = new src.Section("Capitolul 1.1.1");
        src.Section cap1111 = new src.Section("Subchapter 1.1.1.1");
        noapteBuna.addContent(new src.Paragraph("Multumesc celor care ..."));
        noapteBuna.addContent(cap1);
        cap1.add(new src.Paragraph("Moto capitol"));
        cap1.add(cap11);
        cap11.add(new src.Paragraph("Text from subchapter 1.1"));
        cap11.add(cap111);
        cap111.add(new src.Paragraph("Text from subchapter 1.1.1"));
        cap111.add(cap1111);
        cap1111.add(new src.Image("Image subchapter 1.1.1.1"));
        noapteBuna.print();

    }
}
