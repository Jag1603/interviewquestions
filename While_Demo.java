package oops;

public class While_Demo 
{

	public static void main(String[] args) 
	{
		int n = 5;
		String x = "qwerty";

		String y = "Qwerty";
				
		while (x!=y) 
		{
			System.out.println(n);
			n+=5;
			if(n>=500+5)
			{
				y = "qwerty";
			}
		}
	}

}
