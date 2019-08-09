package teststring;
import java.util.StringTokenizer;

public class Demo3 {
	
	public static void main (String args[])
	{
		int i = 0;
		int j = 0;

		String quote = "Once upon a time : The movie";
		StringTokenizer token = new StringTokenizer(quote, ":");
		System.out.println(token.countTokens());
		String[] arr = new String[token.countTokens()];
		
		while (token.hasMoreTokens())
		{
			arr[i] = token.nextToken();
			i++;
		}
		i--;
		while (i>=j)
		{
			System.out.println(arr[i]);
			i--;
		}
	}

}
