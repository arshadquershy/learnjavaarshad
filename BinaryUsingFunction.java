import java.util.Scanner;
class Binaary{
	public static int  conversion(int num) {
		int binary=0,base=1,ones=0,rem;
		int decimalnum=num;
	while(num>0)
	{
		rem=num%2;
		if(rem==1)
		{
			ones++;
		}
		binary=binary+rem*base;
		num=num/2;
		base=base*10;
	}
       

		System.out.println(binary);
		System.out.println("the number of ones is"+ones);
		return binary;

		
	}



public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int num,x;
	System.out.println("enter a number");
	num=in.nextInt();
	 x=conversion(num);
	
}
}

