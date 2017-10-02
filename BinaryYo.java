import java .util.Scanner;
class BinaryYo
{
	public static long  DecimalToBinary(long n) {
		long remainder;
		long  binary=0,i=1,count=0;
		while(n!=0){
		 remainder=n%2;
		 if(remainder==1)
		   {
			 count++;
		   }
		   n=n/2;
		   binary=binary+(remainder*i);
		   i=i*10;
		}	
			//System.out.println("the number of ones is:"+count);		
		/*while(binary>0)
			{
				if (binary%10==1)
				count++;
		}
		System.out.println("the number of ones is:"+count);
		*/
	 System.out.println("the number of ones is :"+count);
	 return binary;
	} 

	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		long  decimal;
        System.out.println("enter the number");
		decimal=in.nextInt();
		System.out.println(DecimalToBinary(decimal));
		//System.out.println("the number of ones is:"+count);

	}
}