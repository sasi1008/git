package StringMethods2;

public class subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Str = "Welcome to geeksforgeeks";
		  
        // prints the subsequence from 0-7, exclusive 7th index
        System.out.print("Returns: ");
        System.out.println(Str.subSequence(0, 7));
  
        System.out.print("Returns: ");
        System.out.println(Str.subSequence(10, 24));
	}

}
