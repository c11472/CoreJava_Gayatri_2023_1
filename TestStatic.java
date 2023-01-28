
public class TestStatic {
	
	public static void main(String args[]) {
		TestStaticMethod ts = new TestStaticMethod();
		ts.test1();
		//ts.test2();
	}

}

 class TestStaticMethod {
	 
	 static void test1() {
		 int value=900;
		 System.out.println(value);
	 }
	
}
