package packages.enumeradores;

public class Pessoa {
    private TipoDocumento tipoDocumento;
    private String numeroDocumento;

    public Pessoa() {
    }
    
    public Pessoa(TipoDocumento tipoDocumento, String numeroDocumento) {
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
    }

    
    public TipoDocumento gettipoDocumento() {
        return tipoDocumento;
    }
    public void settipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }
    public String getNumeroDocumento() {
        return numeroDocumento;
    }
    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    @Override
    public String toString() {
        return "Pessoa [numeroDocumento=" + numeroDocumento + ", tipoDocumento=" + tipoDocumento + "]";
    }

}
