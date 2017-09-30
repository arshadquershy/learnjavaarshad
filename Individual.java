import java.util.Scanner;
class Solve
{
	public static int  sum(int num) {
    if (num != 0)
    {
        return (num % 10 + sum (num / 10));
    }
    else
    {
       return 0;
    }
	}
	public static void main(String[] args) {

		Scanner in =new Scanner(System.in);
		int num,result=0;
		System.out.println("enter the number");
		num=in.nextInt();
		result=sum(num);
		System.out.println(result);		



	}
}