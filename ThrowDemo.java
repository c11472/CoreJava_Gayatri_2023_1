//User defined exception using throw
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.channels.AlreadyBoundException;
import java.util.Scanner;

public class ThrowDemo {
	public static void main(String args[]) throws IOException 
	{
	   double price;
	   //Take input for price
	   Scanner c = new Scanner(System.in);
	   System.out.println("Enter the price :");
	   price=c.nextDouble();
	   //condition 
	   if(price >1000.00)
		   {
		   throw new ArithmeticException("The price is too high !"); // throw the exception
		   }
	   else
	       {
		   System.out.println("Correct price");}}}
