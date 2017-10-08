import java.util.Scanner;
class PatternUsingRecursion
{
	public static String Pattern(int n ){
      	if( n <=0 )
   		return " ";
 		String p = Pattern(n - 1);
   		p = p + "*";
    	System.out.println(p);

    	return p;
    	}					
    public static void main(String[] args) {
   		Scanner in=new Scanner(System.in);
		System.out.println("enter the number");
		int n=in.nextInt();	
		System.out.println(Pattern(n));
	}
}