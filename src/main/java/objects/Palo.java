package objects;

import static com.diogonunes.jcolor.Ansi.colorize;

public enum Palo {
    HEART("\u2665",Color.RED),
    SPADE("\u2660",Color.BLACK),
    DIAMOND("\u2666",Color.RED),
    CLUB("\u2663",Color.BLACK);
    private String shape;
    private Color color;

    Palo(String shape, Color color){
        this.shape = shape;
        this.color = color;
    }



    @Override
    public String toString(){
         return colorize(shape,color.getColor());
    }
}
