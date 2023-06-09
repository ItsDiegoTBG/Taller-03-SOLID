package Fixed;
//Liskov Sub Principle



public class Ornitorrinco extends MamiferoHuevo {
	@Override
	public String eat() {
		return "Fish";
	}
	@Override
	public void walk() {
		System.out.println("Walking");
	}
	@Override
	public void EGG() {
		System.out.println("Lay EGG");
	} 
}
