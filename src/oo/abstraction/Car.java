package oo.abstraction;

public class Car {
  String brand;
	int cc;
	String name;
	String type;
	int status;
	int id;
	float milage;
	public Car (String brand, String name,int cc){
		this.brand=brand;
		this.name=name;
		this.cc=cc;
	
	}
public void setMilage(int m){
	milage=m;
}
public float addmilage(int m){
	milage=milage+m;
	return milage;
}
public void maimtain(){
	status=5;
}
}
