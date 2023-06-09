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
	
	
}
