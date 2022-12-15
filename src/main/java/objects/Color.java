package objects;

import com.diogonunes.jcolor.Attribute;
import static com.diogonunes.jcolor.Ansi.colorize;

public enum Color {

    BLACK(Attribute.BLACK_TEXT()),
    RED(Attribute.RED_TEXT());

    Attribute color;

    Color(Attribute color){
        this.color = color;
    }
    public Attribute getColor(){
        return color;
    }

}
