// Lambda without parameter with return type

// functional interface
interface IDemo4{
	
	int add();
	
}
public class Lambda4 {

	public static void main(String[] args) {
		
		// Lambda without parameter and return type
		IDemo4 objA= () -> 	(5+4);

				
		System.out.println("Sum = " + objA.add());
		var x = 10;
		System.out.println(x);

	}

}
