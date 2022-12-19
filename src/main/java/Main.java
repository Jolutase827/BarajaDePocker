import com.diogonunes.jcolor.Attribute;
//import objects.Baraja;
import objects.*;

import java.util.Scanner;

import static com.diogonunes.jcolor.Ansi.colorize;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Game partida;
        Jugador[] jugadores;
        int cantidadDeJugadores;
        System.out.println("Dime cuantos jugadores van a jugar:");
        cantidadDeJugadores = sc.nextInt();
        jugadores = new Jugador[cantidadDeJugadores];
        for (int i =0; i<jugadores.length; i++){
            System.out.println("Dime el nombre del jugador " + (i+1));
            jugadores[i] = new Jugador(sc.next());
        }
        partida = new Game(jugadores);
        partida.start();
    }
}