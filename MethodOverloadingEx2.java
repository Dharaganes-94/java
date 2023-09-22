package intermediate;


class Arthmetic1
{
	void add(int a ,int b)
	{
	 int c;
	 c=a+b;
	 System.out.println("The Addition of 2 nos is  "+c);

	}
	
	void add(double a,double b)
	{
	 double c;
	 c=a+b;
     System.out.println("The Addition of double value  is  "+c);

	 
	}
}

public class MethodOverloadingEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Arthmetic1 obj =new Arthmetic1();
		obj.add(5, 7);
		obj.add(6.8, 7.20);

	}

}
