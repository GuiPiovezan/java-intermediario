package packages.elementosbasicos;

public class TesteWrapper {
    public static void main(String[] args) {
        //representação de números inteiros
        Short num1 = new Short((short) 2);
        Byte num2  = new Byte((byte) 10);
        Integer num3 = new Integer(5);
        Long  num4  = new Long(10000l);

        //representação de números decimais
        Float num5 = new Float(4.8f);
        Double num6 = new Double(12.966);

        //representação de um valor boolean
        Boolean bool = new Boolean(true);

        //representa um character
        Character aCharacter = new Character('f');

        //Represente um texto
        String string = new String("olá mundo");

    }
}
