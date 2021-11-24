package packages.enumeradores.exercicios;

public enum OperadoresMatematicos {
    SOMAR("+") {
        @Override
        public double executarOperacao(double x, double y) {
            return x + y;
        }
    }, DIVIDIR("/") {
        @Override
        public double executarOperacao(double x, double y) {
            return x / y;
        }
    }, SUBTRAIR("-") {
        @Override
        public double executarOperacao(double x, double y) {
            return x - y;
        }
    }, MULTIPLICAR("*") {
        @Override
        public double executarOperacao(double x, double y) {
            return x * y;
        }
    };

    private String valor;

    private OperadoresMatematicos(String valor){
        this.valor = valor;
    }

    public String getValor(){
        return this.valor;
    }

    public abstract double executarOperacao(double x, double y);

    @Override
    public String toString() {
        return this.valor;
    }

    
}
