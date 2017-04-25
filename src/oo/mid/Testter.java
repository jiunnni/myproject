package oo.mid;

public class Testter {

	public static void main(String[] args) {
		Meal m1=new Meal("cola","big mac","fruit",1,155);
		Meal m2=new Meal("red tea","fried chicken","icecream",2,140);
		Meal m3=new Meal("milktea","fish burger","applepie",3,150);
		Meal[]meals=new Meal[3];
		meals[0]=new Meal("cola","big mac","fruit",1,155);
		meals[1]=new Meal("milktea","fish burger","applepie",3,150);
		meals[2]=new Meal("milktea","fish burger","applepie",3,150);
		int i =0;
				for(i=0;i<3;i++);
						 System.out.println(meals[i].total);

	}

}
