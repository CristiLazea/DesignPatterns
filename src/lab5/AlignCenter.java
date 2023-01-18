package lab5;

import src.Paragraph;

public class AlignCenter implements AlignStrategy{
    String aligncenter;

    public  AlignCenter(){
        aligncenter= "                    ";
    }

    @Override
    public String toString() {
        return aligncenter;
    }

    @Override
    public void render(Paragraph ph, Context context) {

    }
}
