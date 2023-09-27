package intermediate;

/*
 * Method overriding or Runtime polymorphism
 * 
 * If both the parent class and child class has the same method signature, then that method is called as a Overridden method
 * 
 * method overriding is used to give a different implemenetation in the child class
 * It comes with parent child relationship. method overriding will happen in the child class
 * 
 * Same method signature--> no difference in the no. of arguments and no difference in the datatype of the arguments
 * 
 * 
 */

class Bike
{
 void run()
 {
	 System.out.println("Bike is Running");
	
 }
 void run1() 
 {
	 System.out.println("Bike is Running");

 }
 void add(int a, int b)
 {
	 int c;
	 c=a+b;
	 System.out.println("The Addition of 2 no is "+c);

 }
}

public class MethodOverridingEx1 extends Bike
{
 void run()
	{
	System.out.println("Overridden the run method in the child class ");

	}
 void add(int a,int b) 
 { 
	 int c;
	 c=a+b;
	 System.out.println("Addition of 2 no is "+c );

 }
	


 public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverridingEx1 obj = new MethodOverridingEx1();
		obj.add(5, 5);
		obj.run();

	}

}
