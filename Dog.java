package week8b;

import java.util.Scanner;

public class Dog{
	//	String color;
	//	String size;
	//	String breed;
	
//	public String getInfo() {
//		return("Breed is :" + breed +" Color is :" + color +" Size is :" + size +" Age is :" +age);
//	}
	
	public void print() {
		
		
		
		//	System.out.println("Breed " + breed + " Color " + color + " Size " + size);
		
		
		
	}
	public static void main(String[]args) {
		int age ;	
		
		String size;
		
		String breed;
		
		String color;
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Enter your Age :");
		
		age = input.nextInt();
		
		
		
		System.out.println("Enter your color :");
		
		color = input.nextLine();
		
		
		System.out.print("Enter your breed :");
		
		breed = input.nextLine();
		
		
		System.out.print("Enter your size :");
		
		size = input.nextLine();
		
		
		
		System.out.println(age+color+size+breed);
		
		
	//	Dog mal = new Dog ();
		
		//	Dog np  = new Dog ();
		
		//	Dog cc  = new Dog  ();
		
		//	mal.breed = "Napolita";
		
		//	mal.color = "red"; 
		
		//	mal.size  = "small";
				
		//	mal.print();
		
		//	np.breed = "Maltes";
		
		//	np.color = "white";
		
		//	np.size  = "big";
			
		//	np.print();
		
		//	cc.breed = "chaw chaw";
		
		//	cc.color = "blue";
		
		//	cc.size  = "medium";
		
		
		//	cc.print();
		
		
		
//		System.out.println(mal.getInfo());
		
	}
}
