package wrongInterfaces;

//INTERFACE SEGREGATION

public class Ornitorrinco implements IMamifero {
	@Override
	public String eat() {
		return "Fish";
	}
	@Override
	public void walk() {
		System.out.println("Walking");
	}
	//Problema aqui es que el Ornitorrinco pone Huevos
	@Override
	public void DontLayEggs() {
		System.out.println("No Egg");
	}
}
