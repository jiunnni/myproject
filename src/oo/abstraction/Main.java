package oo.abstraction;

public class Main {

	public static void main(String[] args) {
		Car c= new Car("xx", "name", 2000);
		c.setMilage(25000);
		//
		float current =c.addmilage(80);
		System.out.println("目前里成為:+current");
	}

}
