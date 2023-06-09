package FixedInterfaces;

//INTERFACE SEGREGATION

public class Ornitorrinco implements IMamifero,IMamiferoHuevo {
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
