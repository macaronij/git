import java.util.Scanner;

public class HelloWorld
{
	private static Scanner clavier = new Scanner(System.in);
	
	public static void main (String[] args)
	{
		System.out.println("ejem");
		int a=5;
		int d = Doub();
		System.out.println(d);
	}
	
	static int Doub()
	{
		System.out.print("ingrese: ");
		int b = clavier.nextInt();
		int c = b*2;
		
		return c;
	}
}
