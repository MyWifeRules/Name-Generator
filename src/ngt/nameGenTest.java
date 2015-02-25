package ngt;

public class nameGenTest {

	static randomNameGen ran = new randomNameGen();
	
	public nameGenTest()
	{
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String b = new String("");
		b = ran.getRandomName(10);
		System.out.println("Random name = " + b);
		String c = new String("");
		c = ran.getRandomJName(4);
		System.out.println("Random Jap name = " + c);

		String a = new String("");
		a = ran.getPredefName();
		System.out.println("PredefName is = " + a);
	}

}
