package StringMethods2;

public class StringMatches {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// a regex pattern for
	    // five letter string that starts with 'a' and end with 's'
	    String regex = "^a...s$";

	    System.out.println("abs".matches(regex));           
	    System.out.println("alias".matches(regex));         
	    System.out.println("an abacus".matches(regex));    
	    System.out.println("abyss".matches(regex));     

	}

}
