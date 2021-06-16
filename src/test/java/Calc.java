import org.testng.Assert;


public class Calc {

	
	public void add() {
		int a=30, b=10;
		System.out.println("I am in add method");
		Assert.assertEquals(40, a+b);
	}
	
}
