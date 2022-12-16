package objects;

public class Jugador {
    private String nombre;
    private Carta[] cartas;

    public Jugador(String nombre){
        this.nombre = nombre;
        this.cartas = new Carta[0];
    }
    public int getPointsPlayer(){
        int totalyPoints = 0;
        for (Carta carta: cartas)
            totalyPoints += carta.getNumero().getPuntuatuion()[0];

        return totalyPoints;
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


    @Override
    public String toString(){
        return "Nombre del jugador: " + nombre + "\n"+
                "Cartas del jugador: " + cartas + "\n"+
                "Total puntos: " + getPointsPlayer();
    }
}
