package oo.io;


import java.io.FileOutputStream;

import java.util.Scanner;

public class SumScores {

	public static void main(String[] args) {
	int sum =0;
			Scanner scanner=new Scanner(System.in);
			for(int i=0;i<3;i++){
				System.out.println("�п�J���Z");
				String data=scanner.nextLine();
				try{
					int score=Integer.parseInt(data);
					sum=sum+score;
				}catch(NumberFormatException e){
					System.out.println("error");
                    i--;			
				}
			}
			
System.out.println(sum);
	}

}
