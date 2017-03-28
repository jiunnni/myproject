package oo.abstraction;

public class FruitTester {

	public static void main(String[] args) {
		Fruit f1=new Fruit("Grape","Circle",150,"Purple");
		Fruit f2=new Fruit("Banana","Strip",100,"Yellow");
		Fruit f3=new Fruit("Kiwi","Oval",200,"Brown");
		int[]n =new int[5];
       System.out.println(n[3]);
       Fruit []fruits=new Fruit[3];
//       char[][] fruits;
       System.out.println(fruits[0]);
	
       fruits[0]=new  Fruit("Grape","Circle",150,"Purple");
       fruits[1]=new Fruit("Banana","Strip",100,"Yellow");
       fruits[2]=new Fruit("Kiwi","Oval",200,"Brown");
      
       System.out.println(fruits[0].name);   
       fruits[0].id=301;
       fruits[1].id=400;
       fruits[2].id=403;
       System.out.println(fruits[0].name);
       int i=0;
       for(i=0;i<3; i++){
    	   System.out.println(fruits[i].name);
    	   
       }
       
       System.out.println(i);
       for(i=1;i<=9;i=i+2){
    	   System.out.println(i);
    	   
       }
       System.out.println(i);
       class AA{
	}
         AA a = new AA ();

	}
}
