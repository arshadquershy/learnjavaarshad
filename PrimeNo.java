import java.util.Scanner;
class PrimeNo
{
	public static int check(int n) {
		int c=0;

		for(c=2;c<n-1;c++)
		{
			if(n%c==0)
				return 0;
		}
		return 1;
	}
	public static void main(String[] args) {
		int x,result;
		Scanner in =new Scanner(System.in);
		System.out.println("enter a number");
		x=in.nextInt();
		result=check(x);
		if(result==1)
			System.out.println("number is prime");
		else
			System.out.println("number is not prime");


	}
}