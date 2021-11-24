package packages.enumeradores.test;

import packages.enumeradores.DiaDaSemana;
import packages.enumeradores.DiaSemana;

public class Aula53 {
    public static void main(String[] args) {
        usandoConstante();
        usandoEnum();
    }

    //Usando constantes
    public static void usandoConstante(){
        System.out.println("Usando constantes");
        imprimeDiaSemana(DiaDaSemana.SEGUNDA);
        imprimeDiaSemana(DiaDaSemana.TERCA);
        imprimeDiaSemana(DiaDaSemana.QUARTA);
        imprimeDiaSemana(DiaDaSemana.QUINTA);
        imprimeDiaSemana(DiaDaSemana.SEXTA);
        imprimeDiaSemana(DiaDaSemana.SABADO);
        imprimeDiaSemana(DiaDaSemana.DOMINGO);
    }

    public static void imprimeDiaSemana(int dia){
        switch (dia) {
            case 1:
                System.out.println("Segunda-Feira");
                break;
            case 2:
                System.out.println("Terça-Feira");
                break;
            case 3:
                System.out.println("Quarta-Feira");
                break;
            case 4:
                System.out.println("Quinta-Feira");
                break;
            case 5:
                System.out.println("Sexta-Feira");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
        }
    }

    //Usando ENUM
    private static void usandoEnum(){
        DiaSemana segunda = DiaSemana.SEGUNDA;
        DiaSemana terca = DiaSemana.TERCA;
        DiaSemana quarta = DiaSemana.QUARTA;
        DiaSemana quinta = DiaSemana.QUINTA;
        DiaSemana sexta = DiaSemana.SEXTA;
        DiaSemana sabado = DiaSemana.SABADO;
        DiaSemana domingo = DiaSemana.DOMINGO;

        System.out.println("Usando enumerators");
        imprimeDiaSemana(segunda);
        imprimeDiaSemana(terca);
        imprimeDiaSemana(quarta);
        imprimeDiaSemana(quinta);
        imprimeDiaSemana(sexta);
        imprimeDiaSemana(sabado);
        imprimeDiaSemana(domingo);
    }

    public static void imprimeDiaSemana(DiaSemana dia){
        switch (dia) {
            case SEGUNDA:
                System.out.println("Segunda-Feira");
                break;
            case TERCA:
                System.out.println("Terça-Feira");
                break;
            case QUARTA:
                System.out.println("Quarta-Feira");
                break;
            case QUINTA:
                System.out.println("Quinta-Feira");
                break;
            case SEXTA:
                System.out.println("Sexta-Feira");
                break;
            case SABADO:
                System.out.println("Sábado");
                break;
            case DOMINGO:
                System.out.println("Domingo");
                break;
        }
    }

}
