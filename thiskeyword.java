/*******
 * Sample demo for this keyword
 ******/
public class thiskeyword {
	int empid;
	String empName;
	double sal;
	//parameterized constructor
	thiskeyword(int empid,String empName,double sal)
	{
		this.empid=empid;
		this.empName=empName;
		this.sal=sal;
	}
	//method for employee details display
	public void EmpDetails(){
		System.out.println("The employee details are : " + empid + " "
	+ empName + " "+ sal);
	}
	// main method
	public static void main(String args[]) {
	    thiskeyword  obj = new thiskeyword(1110,"Prachi",89900.90);
	    obj.EmpDetails();	//output 1110 Prachi 89900.90	
	}
}
