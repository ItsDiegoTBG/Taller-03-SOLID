package Fixed;

//Single-Responsibility Principle

abstract class Persona {

    private String id;
    private String nombreCompleto;

Persona(String id, String nombreCompleto){
   this.id=id;   
   this.nombreCompleto=nombreCompleto;}
 
    public String getId(){
	return id;
}
	public String getNombreC(){
	return nombreCompleto;
}
//Open and Close Principle
	public static void main(String[] args) {
		Persona[] lP= {
				new Medico("2","Pablito Gomez"),
				new Abañil("3","Roberto Lara")};
	for (Persona s:lP) {
	
			System.out.println(s.getTrabajo());
			
		}		
	}

 abstract String getTrabajo();
}
