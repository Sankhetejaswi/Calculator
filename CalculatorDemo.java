import java.util.Scanner;
class calculator{
	int n1;
	int n2;
	int result;
	
	public void add(int n1 , int n2) { 
		
		System.out.println("Addition is " + (n1+n2));
	}
	
	public void sub(int n1 , int n2) {
		
		System.out.println("Subtraction is "+ (n1-n2)); 	
	}
	
	public void mult(int n1 , int n2) {
		
		System.out.println("Multiplication is " + n1*n2);
	}
	
	public void div(int n1 , int n2) {
		
		System.out.println("Division is " + n1/n2);
	}
	
	public void mod(int n1 , int n2) {
		
		System.out.println("Modulus is " + n1%n2);
	}
}
class CalculatorDemo{
	public static void main(String []args) {
		Scanner input = new Scanner(System.in);
		calculator obj = new calculator();
		
		System.out.println("Enter value of n1");
		int n1 = input.nextInt();
		
		System.out.println("Enter value of n2");
		int n2 = input.nextInt();
		
		obj.add(n1, n2);
		obj.sub(n1, n2);
		obj.mult(n1, n2);
		obj.div(n1,n2);
		obj.mod(n1, n2);

	}
	
}