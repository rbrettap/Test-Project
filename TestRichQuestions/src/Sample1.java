import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class Sample1
{

	public Sample1()
	{
		System.out.println("here in constructor");
		
	}
	

	public static void main(String [] args)
	{
		int num = 1004;
		
		String numString = String.valueOf(num);
		
		System.out.println(numString);
		
		char[] x1 = numString.toCharArray();
		
		for (int i = 0; i < x1.length; i++) {
			
			if (x1[i] == '0') {
				x1[i] = '5';
			}
			
		}
		
		String result = x1.toString();
		
		System.out.println(result);
	}
}