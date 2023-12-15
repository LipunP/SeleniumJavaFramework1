package general;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {

	@Test
	@Parameters("Name")
	public void test(@Optional("Lipun") String Name)
	{
		System.out.println("Name is:"+Name);
	}
	
}
