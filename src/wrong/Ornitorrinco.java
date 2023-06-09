package wrong;
//Liskov Sub Principle



public class Ornitorrinco extends Mamifero{
	@Override
	public String eat() {
		return "Fish";
	}
	@Override
	public void walk() {
		System.out.println("Walking");
	}
	@Override
	public void DontLayEggs() {
		 throw new UnsupportedOperationException("I LAY EGGS");
	}
}
