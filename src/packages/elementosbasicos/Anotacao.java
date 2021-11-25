package packages.elementosbasicos;

@interface Anotacao {
    String autor();
	
	int aulaNumero();
	
	String blog() default "http://loiane.com";
	
	String site() default "http://loiane.training";
}



