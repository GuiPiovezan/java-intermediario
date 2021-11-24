package packages.enumeradores.exercicios;

public class Teste {
    public static void main(String[] args) {

        double x = 6.0;
        double y = 4.5;

        OperadoresMatematicos[] operadoresMatematicos = OperadoresMatematicos.values();

        System.out.println("Operadores");
        for (OperadoresMatematicos operadorMatematico : operadoresMatematicos) {
            System.out.println(operadorMatematico +" "+ operadorMatematico.getValor());
        }
        

        System.out.println("\nRealizando Operações");
        for (OperadoresMatematicos operadorMatematico : operadoresMatematicos) {
            System.out.println(x + " " +operadorMatematico + " " + y + " = " + operadorMatematico.executarOperacao(x, y));
        }



    }
}
