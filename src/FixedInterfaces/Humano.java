package FixedInterfaces;

//INTERFACE SEGREGATION

public class Humano implements IMamifero{
	public String eat(){
		return "Eating Meat";
	}
	
	public void walk(){
		System.out.println("Walking");
	}
	
}