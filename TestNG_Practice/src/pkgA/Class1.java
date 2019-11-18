package pkgA;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class1 {
	@Test
	public void tc1()
	{
		System.out.println("Test Case 1");
	}
	@BeforeSuite
	public void ab()
	{
		System.out.println("Before Suite");
	}
	@BeforeTest
	public void cd()
	{
		System.out.println("Before Test");
	}
	@BeforeClass
	public void ef()
	{
		System.out.println("Before Class");
	}
	@BeforeMethod
	public void gh()
	{
		System.out.println("Before Method");
	}
	@AfterMethod
	public void ij()
	{
		System.out.println("After Method");
	}
	@AfterClass
	public void kl()
	{
		System.out.println("After Class");
	}
	@AfterTest
	public void mn()
	{
		System.out.println("After Test");
	}
	@AfterSuite
	public void op()
	{
		System.out.println("After Suite");
	}
	@Test
	public void tc2()
	{
		System.out.println("Test Case 2");
	}
	@Test
	public void tc3()
	{
		System.out.println("Test Case 3");
	}
}
