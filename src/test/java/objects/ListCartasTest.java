package objects;

import static org.junit.jupiter.api.Assertions.*;

class ListCartasTest {

    @org.junit.jupiter.api.Test
    void addHead() {
        ListCartas listCartas = new ListCartas();
        listCartas.addHead(new Carta(Palo.HEART,Numero.CINCO));
        listCartas.addHead(new Carta(Palo.HEART,Numero.AS));
        System.out.println(listCartas);
    }

    @org.junit.jupiter.api.Test
    void addTail() {
        ListCartas listCartas = new ListCartas();
        listCartas.addTail(new Carta(Palo.HEART,Numero.CINCO));
        listCartas.addTail(new Carta(Palo.HEART,Numero.AS));
        listCartas.addTail(new Carta(Palo.HEART,Numero.AS));
        System.out.println(listCartas);
    }

    @org.junit.jupiter.api.Test
    void remove() {
        ListCartas listCartas = new ListCartas();
        listCartas.addTail(new Carta(Palo.HEART,Numero.CINCO));
        listCartas.addTail(new Carta(Palo.HEART,Numero.AS));
        listCartas.addTail(new Carta(Palo.SPADE,Numero.AS));
        ListCartas listCartas2 = new ListCartas();
        listCartas2.addTail(new Carta(Palo.HEART,Numero.CINCO));
        listCartas2.addTail(new Carta(Palo.HEART,Numero.AS));
        listCartas.remove(2);
        assertEquals(listCartas2,listCartas);
    }
}