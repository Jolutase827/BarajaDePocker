package objects;

import java.util.Scanner;

public class Game {
    private Jugador[] players;
    private Jugador banking;
    private Baraja baraja;

    public Game(Jugador[] players){
        this.banking = new Jugador("Banca");
        this.baraja = new Baraja();
        this.players = players;
    }


    /*
        barajar
        cada jugador pide carta hasta que diga basta o se pase
        juega la banca
            -solicita siempre  carta mientras no se haya pasado o su puntación sea inferior a todos los jugadores
        Comprobar por cada jugador si ha ganado o ha perdido.
    */

    public void start(){

        baraja.shuffle();
        for (Jugador player : players){
            juegaJugador(player);
        }
        playBanking(bestPuntuation());
        comproveVictory();
    }




    private void playBanking(int bestPuntuation) {
        do {
            banking.stealCard(baraja.getUp());
        }while (banking.getPointsRecursive(0,0)< bestPuntuation || banking.getPointsRecursive(0,0)<21);
    }




    private void juegaJugador(Jugador player){
        Scanner sc = new Scanner(System.in);
        String SiNo = "";
        do {
            System.out.println(player.getNombre() + " quiere coger carta SI o NO");
            SiNo = sc.nextLine().toUpperCase();
            while (esSiNo(SiNo)) {
                System.out.println("Quieres carta o no quieres carta escribe un 'SI' o un 'NO' (sin las comillas por favor)");
                SiNo = sc.nextLine().toUpperCase();
            }
            quiereCarta(SiNo,player);
            System.out.println(player);
        }while (!noQuiereCarta(SiNo,player)&&sePasaDePuntos(player)>0);
    }



    private int bestPuntuation(){
        int maximPuntuation=0;
        for (Jugador player: players){
            if (sePasaDePuntos(player)>maximPuntuation){
                maximPuntuation = player.getPointsRecursive(0,0);
            }
        }
        return maximPuntuation;

    }

    private boolean quiereCarta(String quiereCarta, Jugador player){
        if (quiereCarta.equals("SI")){
            System.out.println("El jugador " + player.getNombre() + " ha cogido carta.");
            player.stealCard(baraja.getUp());
            return true;
        }
        return false;
    }

    private boolean noQuiereCarta(String noquiereCarta, Jugador player){
        if (noquiereCarta.equals("NO")){
            System.out.println("El jugador " + player.getNombre() + " se planta.");
            return true;
        }
        return false;
    }

    private boolean esSiNo(String palabraCondicion){
        if (palabraCondicion.compareToIgnoreCase("SI")!=0&&palabraCondicion.compareToIgnoreCase("NO")!=0){
            return true;
        }
        return false;
    }

    public int sePasaDePuntos(Jugador player){
        if (player.getPointsRecursive(0,0)>21){
            return -1;
        }
        return player.getPointsRecursive(0,0);
    }

    private void comproveVictory(){
        Jugador winner = players[0];
        for (Jugador player: players){
            if (sePasaDePuntos(player)>sePasaDePuntos(winner)){
                winner = player;
            }
        }
        if (sePasaDePuntos(banking)>=sePasaDePuntos(winner)){
            winner = banking;
            System.out.println("El ganador es la banca");
        }else {
            for (Jugador player: players) {
                if (sePasaDePuntos(player) > 0) {
                    System.out.println("Ha ganado " + player.getNombre() + " con " + player.getPointsRecursive(0,0) + " puntos");
                }else {
                    System.out.println("Ha perdido " + player.getNombre() + " con " + player.getPointsRecursive(0,0) + " puntos");
                }
            }
        }

    }




}
