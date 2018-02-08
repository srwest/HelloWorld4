import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HelloWorld
{
	public static void main (String[] args)
	{
		System.out.println("Here ye : important announcement");
		System.out.println("Hello, World!");
		System.out.println("goodbye");
		System.out.println("Hi to both Alice and Bob");
		System.out.println("hi to Charlie and Denise");
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		System.out.println("Todays date: "+dateFormat.format(date));
		System.out.println("Free memory (bytes) = "+Runtime.getRuntime().freeMemory());
	}
}