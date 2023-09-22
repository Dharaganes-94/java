package intermediate;

/*
 * Java Final keyword is used to restrict the user and it can be used along with variables, methods and classes
 * 
 * 1. Whenever we declare a variable as final, then that value of the varaible cant be changed
 * 2. Whenever we declare a method as final, that method cant be overridden in the child class
 * 3. Whehever we declare a class as final, that class cannot be extended
 */

public class FinalVaribleEx {
	
	final int rollno = 10;
	void displayaDetails()
	{
	System.out.println("The roll no is  "+rollno);	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FinalVaribleEx obj = new FinalVaribleEx();
		obj.displayaDetails();
	}

}
