package wrong;

//Single-Responsibility Principle

public class Persona {

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
	
	public void giveJob(String work) {
		 System.out.println(work);
		
	}
	
//Open and Close Principle
	public static void main(String[] args) {
		Persona[] lP= {
				new Persona("2","Pablito Gomez"),
	
	
				new Persona("3","Roberto Lara")};
	for (Persona s:lP) {
		if(s.getNombreC()=="Pablito Gomez") {
			System.out.println("Medico");
		}
		if(s.getNombreC()=="Roberto Lara") {
			System.out.println("Abañil");
		}		
	}	
	}
	}

