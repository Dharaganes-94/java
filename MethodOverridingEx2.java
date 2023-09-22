package intermediate;

class RBI
{
 void interest()
 {
	System.out.println("Interest rate of personal loan is with in 10");

 }
}
class HDFC extends RBI
{
 void interest()
{
	System.out.println("Interest rate of personal loan is with in 9");

 }
}
class Axis extends RBI
{
void interest()
{
	System.out.println("Interest rate of personal loan is with in 8");

}
}
class ICCI extends RBI
{
void interest()
{
	System.out.println("Interest rate of personal loan is with in 8.5");

}
}

public class MethodOverridingEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HDFC hdfc = new HDFC();
		hdfc.interest();
		
		Axis axis = new Axis();
		axis.interest();
		
		ICCI icci = new ICCI();
		icci.interest();

	}

}
