package packages.elementosbasicos;

public class TesteAnotacao {

    @Anotacao(
        aulaNumero = 65,
        autor = "Guilherme"
    )

    public static void main(String[] args) {
        System.out.println("Olá mundo!");
    }
}
