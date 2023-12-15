package excepationDemo;

public class ExceptionDemo {

	public static void main(String[] args) {
		
		try {
		System.out.println("This is an exception demo");
//		int r = 1/0;
		System.out.println("I am nowhere");
		}
		catch(Exception e)
		{
			System.out.println("You caught me");
			System.out.println("Message is"+e.getMessage());
			System.out.println("Cause is "+e.getCause());	
		}
		finally {
			System.out.println("I am inside finally");
		}
		}


	}

