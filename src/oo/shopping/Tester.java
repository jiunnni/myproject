package oo.shopping;

import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {
		ArrayList<Customer>List=new ArrayList<>();
				
		List.add(new Customer(6000));
	List.add(new SilverCustomer(8000));	
	List.add(new GoldenCustomer(10000));
	List.add(new GoldenCustomer(15000));
	List.add(new SilverCustomer(1000));
	List.add(new Customer(6000));
//	for (int i=0;i<List.size();i++){
	//	Customer cust=List.get(i);
	for(Customer cust:List){
		if(cust instanceof SilverCustomer&&
				!(cust instanceof GoldenCustomer)){
			SilverCustomer silver = (SilverCustomer)cust;
			System.out.print("*");
		}
		
		cust.print();
	}
//String[]array={"aa","bb","cc"};
//for(String s :array){
//System.out.println(s);
	}
	}


