package Fixed;
//Open-Closed Principle (OCP)
public class Medico extends Persona {
	
	Medico(String id, String nombreCompleto) {
		super(id, nombreCompleto);
	}

	public String getTrabajo() {
		return "Medico";
	}
}
