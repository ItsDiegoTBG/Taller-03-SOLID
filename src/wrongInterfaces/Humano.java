package wrongInterfaces;

//INTERFACE SEGREGATION

public class Humano implements IMamifero{
	public String eat(){
		return "Eating Meat";
	}
	
	public void walk(){
		System.out.println("Walking");
	}
	
	@Override
	public void DontLayEggs() {
		System.out.println("No Egg");
	}
}