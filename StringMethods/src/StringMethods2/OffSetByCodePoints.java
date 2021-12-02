package StringMethods2;

public class OffSetByCodePoints {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// initialize the StringBuffer object
		StringBuffer strbuff = new StringBuffer("w3resource.com");
		
		System.out.println("\nContents of buffer:" + strbuff);

		// get the offsetByCodePoints on index of 3 and an offset of 9
		int index = 3;
		int codePointOffset = 9;

		System.out.println("Result :"
				+ strbuff.offsetByCodePoints(index, codePointOffset));
        System.out.println();

	}

}
