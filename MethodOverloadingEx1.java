package intermediate;
/*
 * Polymorphism means many forms. We have 2 types of polymorphism,
 * 
 * 1. Method overloading or compiletime polymorphism
 * 2. Method overriding or Runtime polymorphism
 * 
 * Method Overloading-->
 * If a class has 2 methods with the same name but with difference in the no. of arguments and data type
 * Method overloading should happen within the same class
 */


//Method overloading with regard to difference in the no. of arguments

class Arthmetic
{
 void add(int a,int b)
 {
	int c;
	c=a+b;
	System.out.println("The Addition of 2 nos is  "+c);
 }
 void add(int a,int b,int c)
 {
	 int d;
	 d= a+b+c;
	System.out.println("The Addition of 3 nos is  "+d);

 }
}

public class MethodOverloadingEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Arthmetic obj =new Arthmetic();
		obj.add(5, 5);
		obj.add(5,6,7);

	}

}
