package StringMethods2;

public class replaceFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String Str = new String("Welcome to Tutorialspoint.com");

	      System.out.print("Return Value :" );
	      System.out.println(Str.replaceFirst("(.*)Tutorials(.*)", "AMROOD"));

	      System.out.print("Return Value :" );
	      System.out.println(Str.replaceFirst("Tutorials", "AMROOD"));
	}

}
