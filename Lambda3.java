interface Idemo3{
	void sayHello(String fname,String lname);
}
public class Lambda3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Idemo3 obj3 = (String fname,String lname) -> System.out.println(fname + " " + lname);
		obj3.sayHello("cpp", "java");

	}

}
