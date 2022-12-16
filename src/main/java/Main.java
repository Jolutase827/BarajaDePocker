import com.diogonunes.jcolor.Attribute;
//import objects.Baraja;
import objects.*;

import static com.diogonunes.jcolor.Ansi.colorize;

public class Main {
    public static void main(String[] args) {
        Carta carta = new Carta( Palo.HEART, Numero.NUEVE);
        Baraja baraja = new Baraja();
        System.out.println(baraja);
    }
}