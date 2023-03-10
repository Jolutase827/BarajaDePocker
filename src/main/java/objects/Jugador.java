package objects;

public class Jugador {
    private String nombre;
    private Carta[] cartas;

    public Jugador(String nombre){
        this.nombre = nombre;
        this.cartas = new Carta[0];
    }

    public int getPointsRecursive(int posicion, int suma){
        if (suma<=21 && posicion>= cartas.length){
            return suma;
        }
        if (posicion>=cartas.length){
            return suma;
        }
        if (cartas[posicion].getNumero().getPuntuatuion().length>1) {
            if (getPointsRecursive(posicion + 1, suma + cartas[posicion].getNumero().getPuntuatuion()[1]) <= 21) {
                return getPointsRecursive(posicion + 1, suma + cartas[posicion].getNumero().getPuntuatuion()[1]);
            }

        }
        return getPointsRecursive(posicion+1, suma+cartas[posicion].getNumero().getPuntuatuion()[0]);
    }



    public String  getCardsPlayer(){
        String cardsPlayer = "";
        for (Carta card: cartas)
            cardsPlayer += card+" ";
        return cardsPlayer;
    }

    public void stealCard(Carta stealedCard){
        Carta[] cartas1 = new Carta[cartas.length+1];
        for (int i = 0; i<cartas.length; i++){
            cartas1[i] = cartas[i];
        }
        cartas1[cartas.length] = stealedCard;
        cartas = cartas1;
    }
    public String getNombre(){
        return nombre;
    }


    @Override
    public String toString(){
        String salida= "Nombre del jugador: " + nombre + "\n";
        salida += "Cartas del jugador: ";
        for (Carta carta : cartas)
            salida += carta +" ";
        salida+= "\n";
        salida+="Total puntos: " + getPointsRecursive(0,0);
        return salida;
    }
}
