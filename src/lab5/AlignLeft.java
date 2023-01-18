package lab5;

import src.Paragraph;

public class AlignLeft implements AlignStrategy{
    String alignleft;

    public AlignLeft() {
        alignleft = "";
    }


    @Override
    public String toString() {
        return alignleft;
    }
    @Override
    public void render(Paragraph ph, Context context) {
        ph.setDescription(alignleft + ph.getDescription());
    }
}
