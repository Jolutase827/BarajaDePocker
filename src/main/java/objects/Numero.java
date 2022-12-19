package objects;

public enum Numero {
    AS('A',new int[]{1,11}),
    DOS('2', new int[]{2}),
    TRES('3',new int[]{3}),
    CUATRO('4',new int[]{4}),
    CINCO('5',new int[]{5}),
    SEIS('6',new int[]{6}),
    SIETE('7',new int[]{7}),
    OCHO('8',new int[]{8}),
    NUEVE('9',new int[]{9}),
    J('J',new int[]{10}),
    Q('Q',new int[]{10}),
    K('K',new int[]{10});
    private char valor;
    private int[] puntuation;

    Numero(char number, int[] puntuation){
        this.valor = number;
        this.puntuation = puntuation;
    }
    public int[] getPuntuatuion(){
        return puntuation;
    }

    @Override
    public String toString(){
        return ""+ valor;
    }

}
