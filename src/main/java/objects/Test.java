package objects;

public class Test {
    public static void main(String[] args){
        Jugador mario = new Jugador("Mario");
        mario.stealCard(new Carta(Palo.HEART,Numero.AS));
        mario.stealCard(new Carta(Palo.HEART,Numero.AS));
        mario.stealCard(new Carta(Palo.HEART,Numero.AS));
        System.out.println(mario);
        System.out.println(mario.getPointsRecursive(0,0));
    }
}
