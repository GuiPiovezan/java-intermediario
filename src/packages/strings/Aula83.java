package packages.strings;

public class Aula83 {
    public static void main(String[] args) {
        String[] letras = {"B", "C", "D", "E", "F"};

		String alfabeto = "";
		
		for (String letra : letras){
			alfabeto += letra;
		}

		System.out.println(alfabeto);
		
        //Não é thread safe, tem que usar com threads
		StringBuffer sb = new StringBuffer();
		for (String letra : letras){
			sb.append(letra);
		}
		alfabeto = sb.toString();
		
		System.out.println(alfabeto);
		
		alfabeto = new String(sb);
		System.out.println(alfabeto);
		
		System.out.println(sb.reverse());
		
        //Thread safe, usa-se quando não há threads
		StringBuilder sb_ = new StringBuilder();
		for (String letra : letras){
			sb_.append(letra);
		}
		alfabeto = sb_.toString();
		
		System.out.println(alfabeto);
    }
}
