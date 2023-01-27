package objects;

import java.util.*;

public class Baraja {
    private ListCartas cartas;

    public Baraja() {
        cartas = new ListCartas();
        int i = 0;
        for (Palo palo : Palo.values()) {
            for (Numero numero : Numero.values())
                cartas.addTail( new Carta(palo, numero));
        }
    }

    public void shuffle() {
        cartas.shuffle();
    }

    public Carta getUp() {
        if (cartas.getSize()>0) {
            return cartas.remove(0);
        }else
            return null;
    }

    public Carta getDown() {
        if (cartas.getSize()>0) {
            return cartas.remove(cartas.getSize()-1);
        }else
            return null;
    }

    public Carta showUp() {
        return cartas.getHead();
    }

    public Carta showDown() {
        return cartas.getTail();
    }
    public int getSize(){
        return cartas.getSize();
    }

    @Override
    public String toString() {
        return "Baraja"+cartas;
    }


}
