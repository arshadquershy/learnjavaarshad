import java.util.Scanner;
class Fibon
{
	public static int  R(int n) {
		if(n<2)
			return n;
		else
		{
			return R(n-1) + R(n-2);
		}

		
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int num,result=0;
		System.out.println("enter the number of terms u want to print the fibnoacci series");
		num=in.nextInt();
		for(int i=0;i<num;i++){
		//result=Recurr(int num);
		System.out.print(R(i)+" ");
		}

	}
}