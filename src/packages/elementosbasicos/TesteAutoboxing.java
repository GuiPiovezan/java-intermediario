package packages.elementosbasicos;

public class TesteAutoboxing {
    public static void main(String[] args) {
        //Autoboxing
        Short num1 = 1;
        Byte num2  = 10;
        Integer num3 = 100;
        Long  num4  = 10000L;
        Float num5 = 4.8f;
        Double num6 = 92.145888;
        Boolean bool = true;
        Character aCharacter = 'f';

        //Auto un-boxing
        short num7 = num1;
        byte  num8 = num2;
        int   num9 = num3; //num3.intValue();
        long  num10 = num4;
    }
}
