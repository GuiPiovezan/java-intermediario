package packages.enumeradores.test;

import packages.enumeradores.Pessoa;
import packages.enumeradores.TipoDocumento;

public class Aula56 {
    public static void main(String[] args) {
        //  TipoDocumento[] tipoDocumentos = TipoDocumento.values();

        //  for (TipoDocumento tipoDocumento : tipoDocumentos) {
        //      System.out.println("\n" + tipoDocumento + " - " + tipoDocumento.geraNumeroTeste());
        //  }

        Pessoa pessoa = new Pessoa();

        pessoa.settipoDocumento(TipoDocumento.CPF);
        // ou 
        pessoa.settipoDocumento(Enum.valueOf(TipoDocumento.class, "CPF"));
        pessoa.setNumeroDocumento(pessoa.gettipoDocumento().geraNumeroTeste());


        System.out.println(pessoa);

        Pessoa pessoaJuridica = new Pessoa();
        pessoaJuridica.settipoDocumento((TipoDocumento.CNPJ));
        pessoaJuridica.setNumeroDocumento(pessoaJuridica.gettipoDocumento().geraNumeroTeste());

        System.out.println(pessoaJuridica);
    }
}
