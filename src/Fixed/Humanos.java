package Fixed;

//Liskov Sub Principle
public class Humanos extends Mamifero{
	@Override
	public String eat() {
		return "Eating Meat";
	}
	@Override
	public void walk() {
		System.out.println("Walking");
	}
	
}