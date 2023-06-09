package wrong;

//Liskov Sub Principle

public class Mamifero {
	
	public String eat() {
		return "Food";
	}
	
	public void walk() {
		System.out.println("Walking");
	}
	
	public void DontLayEggs() {
		System.out.println("No Egg");
	}
}

