package wrong;

//Dependency Inversion Principle

//Modulo de alto nivel 

public class Smartphone {
private Camara camara;
private Reloj reloj;
private Navegador navegador;

	public Smartphone() {
	this.camara = new Camara(); // Violación del DIP
	this.reloj = new Reloj(); // Violación del DIP
	this.navegador = new Navegador(); // Violación del DIP
}
	
//Modulos de bajo nivel
public class Camara {}
public class Reloj{}
public class Navegador{}
	
}

