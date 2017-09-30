import java.util.Scanner;
class Check

{
	public static int  prime(int num) {
		for(int i=2;i<num/2;i++)
		{
			if(num==0)
				continue;
			else 
				return 1;
		}
	 return 0;
	}
		
		public static void main(String[] args) {
				int num,res=0;
				Scanner in=new Scanner(System.in);
				System.out.println("enter the number");
				num=in.nextInt();
				res=prime(num);
				if(res==0)
				System.out.println("prime number ");
				else
				System.out.println("not a prime number");	
		}

}



