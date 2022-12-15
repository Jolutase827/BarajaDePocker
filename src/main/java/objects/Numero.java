package objects;

public enum Numero {
    AS('A'),
    DOS('2'),
    TRES('3'),
    CUATRO('4'),
    CINCO('5'),
    SEIS('6'),
    SIETE('7'),
    OCHO('8'),
    NUEVE('9'),
    J('J'),
    Q('Q'),
    K('K');
    private char number;

    Numero(char number){
        this.number = number;
    }

    @Override
    public String toString(){
        return ""+number;
    }

}
