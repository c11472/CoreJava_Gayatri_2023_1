// Example with parameter and return type

// Functional Interface
interface IDemo5 {
	int add(int a,int b);
}


public class Lambda5 {

	public static void main(String[] args) {
		
		// Lambda definition
		IDemo5 objA =(int a,int b) -> a+b;
		
		
		// calling the Lambda function with parameter and return type
		System.out.println("Sum =" + objA.add(25, 12));

	}

}
