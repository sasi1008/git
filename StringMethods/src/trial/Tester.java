package trial;


public class Tester{
	static int v1 , v2 = 20;
	static void getData() {
		System.out.println("FV" + v1);
	}
	static void display() {
		System.out.println("SV" + v2);
	}
	static{
		System.out.println("Hello World");
		v1= 4*v2;
		
	}
	public static void main(String[] args) {
		++Tester.v1;
		++Tester.v2;
		Tester.getData();
		Tester.display();
	}
}