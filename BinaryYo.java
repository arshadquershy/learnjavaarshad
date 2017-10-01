import java .util.Scanner;
class BinaryYo
{
	public static long  DecimalToBinary(long n) {
		long remainder;
		long  binary=0,i=1;
		while(n!=0){
			remainder=n%2;
			n=n/2;
			binary=binary+(remainder*i);
			i=i*10;		

		}
		return binary;

		
	}
	public static void main(String[] args){
			Scanner in=new Scanner(System.in);
			long  decimal;

		System.out.println("enter the number");
		decimal=in.nextInt();
		System.out.println(DecimalToBinary(decimal));

	}
}