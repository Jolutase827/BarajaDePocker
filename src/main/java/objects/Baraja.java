package objects;

import java.util.*;

public class Baraja {
    private Carta[] cartas;

    public Baraja() {
        cartas = new Carta[Palo.values().length * Numero.values().length];
        int i = 0;
        for (Palo palo : Palo.values()) {
            for (Numero numero : Numero.values())
                cartas[i++] = new Carta(palo, numero);


        }
    }

    public void shuffle() {
        List<Carta> cartaList = Arrays.asList(cartas);
        Collections.shuffle(cartaList);
        cartaList.toArray(cartas);

    }

    public Carta getUp() {
        if (cartas.length>0) {
            Carta upCard = cartas[cartas.length - 1];
            Carta[] nuwCartas = new Carta[cartas.length - 1];
            for (int i = 0; i < nuwCartas.length; i++)
                nuwCartas[i] = cartas[i];
            cartas = nuwCartas;
            return upCard;
        }else
            return null;
    }

    public Carta getDown() {
        if (cartas.length>0) {
            Carta downCard = cartas[0];
            Carta[] nuwCartas = new Carta[cartas.length - 1];
            for (int i = 1; i < cartas.length; i++)
                nuwCartas[i-1] = cartas[i];
            cartas = nuwCartas;
            return downCard;
        }else
            return null;
    }

    public Carta showUp() {
        if (cartas.length > 0)
            return cartas[cartas.length - 1];
        else
            return null;
    }

    public Carta showDown() {
        if (cartas.length > 0)
            return cartas[0];
        else
            return null;
    }
    public int getSize(){
        return cartas.length;
    }

    @Override
    public String toString() {
        String baraja = "";
        for (Carta i : cartas) {
            baraja += i +" ";
        }

        return baraja;
    }


}
