package objects;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListCartas {
    private int size;
    private Node head;
    private Node tail;

    public ListCartas(){
        size = 0;
        head = null;
        tail=null;
    }

    public void shuffle(){
        Carta[] cartas = toArray();
        List<Carta> cartaList = Arrays.asList(cartas);
        Collections.shuffle(cartaList);
        cartaList.toArray(cartas);

        clear();

        for (Carta c :  cartas)
            addHead(c);

    }

    public void clear(){
        size=0;
        tail = null;
        head = null;
    }


    public Carta[] toArray(){
        Carta[] cartas = new Carta[size];
        int i = 0;
        Node aux = head;
        while (i<size){
            cartas[i] = aux.getInfo();
            aux = aux.getNext();
            i++;
        }

        return cartas;
    }

    public void addHead(Carta carta){
        Node node = new Node(carta);
        if (head==null){
            head = node;
            tail = node;
        }else {
            node.setNext(head);
            head = node;
        }
        size++;
    }

    public void addTail(Carta carta){
        Node node = new Node(carta);
        if (head==null){
            head = node;
            tail = node;
        }else {
            tail.setNext(node);
            tail = node;
        }
        size++;
    }

    public Carta remove(int position){
        Carta removed;
        if (position>=size||position<0)
            return null;

        if (position == 0){
            removed = head.getInfo();
            head = head.getNext();
        }else {
            Node aux1 = head;
            Node aux2 = head.getNext();
            while (position > 1) {
                aux1 = aux2;
                aux2 = aux2.getNext();
                position--;
            }
            removed = aux2.getInfo();
            aux1.setNext(aux2.getNext());
        }
        size--;
        return removed;
    }

    public int getSize() {
        return size;
    }


    public Carta getHead(){
        if (head == null){
            return null;
        }
        return head.getInfo();
    }

    public Carta getTail(){
        if (tail == null){
            return null;
        }

        return tail.getInfo();

    }


    @Override
    public boolean equals(Object obj){
        if (obj instanceof ListCartas){
            ListCartas listCartas = (ListCartas) obj;
            if (size != listCartas.size)
                return false;
            boolean encontrado = false;
            Node aux1 = head;
            Node aux2 = listCartas.head;
            while (aux1!=null&&!encontrado){
                if (!aux1.equals(aux2)){
                    encontrado = true;
                }
                aux2 = aux2.getNext();
                aux1 = aux1.getNext();
            }
            return !encontrado;
        }
        return false;
    }


    @Override
    public String toString() {
        return "{Nº Cartas:"+size+", Cartas: "+head+"}";
    }
}
