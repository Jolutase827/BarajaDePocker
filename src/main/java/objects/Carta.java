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
}
