import java.util.Scanner;

public class fibo {
	
	public static void main(String [] arg){
		
		
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a Value");
		int n = keyboard.nextInt();
		
		System.out.println(fibo(n));
	}
	
	public static int fibo(int n)
	{
		if (n==0||n==1)
			return n;
		else
			return fibo(n-2) + fibo(n-1);
	}

}
