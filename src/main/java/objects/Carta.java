package objects;

public class Carta {
    private Palo palo;
    private Numero numero;

    private Color color;

    public Carta(Palo palo, Numero numero){
        this.numero = numero;
        this.palo= palo;
    }
    public Palo getPalo(){
        return palo;
    }
    public Numero getNumero(){
        return numero;
    }
    @Override
    public String toString(){
        return numero + palo.toString();
    }


    @Override
    public boolean equals(Object obj){
        if (obj instanceof Carta){
            Carta carta = (Carta) obj;
            return (palo.equals(carta.palo)&&numero.equals(carta.numero));
        }
        return false;
    }
}
