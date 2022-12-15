package objects;

public class Baraja {
    private Carta[] cartas;
    public Baraja(){
        cartas = new Carta[Palo.values().length*Numero.values().length];
        int i = 0;
        for (Palo palo:Palo.values()){
            for(Numero numero: Numero.values())
                cartas[i++] = new Carta(palo,numero);


        }
    }
    @Override
    public String toString(){
        String baraja="";
        for (Carta i:cartas){
            baraja += i+"\n";
        }

        return baraja;
    }


}
