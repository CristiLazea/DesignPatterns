package lab5;

import src.Paragraph;

public class AlignRight implements AlignStrategy{

    private String atributes;

    public AlignRight() {
        atributes = "                                          ";
    }

    @Override
    public String toString() {
        return atributes;
    }

    @Override
    public void render(Paragraph ph, Context context) {

    }
}
