package StringMethods2;

public class format {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="sonoo";  
		String sf1=String.format("name is %s",name);  
		String sf2=String.format("value is %f",32.33434);  
		String sf3=String.format("value is %12.12f",32.33434);//returns 12 char fractional part filling with 0  
		  
		System.out.println(sf1);  
		System.out.println(sf2);  
		System.out.println(sf3);

	}

}
