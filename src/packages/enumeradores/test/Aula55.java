package packages.enumeradores.test;

import packages.enumeradores.DiaSemana;

public class Aula55 {
    public static void main(String[] args) {
        DiaSemana[] dias = DiaSemana.values();
        
        for (DiaSemana dia : dias) {
            System.out.println(dia);
        }

        System.out.println("\nTestando ValueOf");

        DiaSemana dia = Enum.valueOf(DiaSemana.class, "DOMINGO");
        System.out.println(dia);
    }
}
