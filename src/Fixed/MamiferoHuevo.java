package Fixed;

//Liskov Sub Principle

public class MamiferoHuevo extends Mamifero {
	public String eat() {
		return "Food";
	}
	
	public void walk() {
		System.out.println("Walking");
	}
	
	public void EGG() {
		
	}
}

