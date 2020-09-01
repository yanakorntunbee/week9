package week8b;

public class Apple{
	
	String color;
	
	String size;
	
	int age;
	
	public void print() {
		
		System.out.println("| Dog skin = "+ color +" | Dog Size = "+ size +" | Dog age = "+ age + " |");
		
	}
	
	public static void main(String[]args) {
		
	  Apple first = new Apple ();
	  
	  first.color = "white";
	  
	  first.size  = "small";
	  
	  first.age   = 90;
	  
	  first.print();
	  
  } 
	
}