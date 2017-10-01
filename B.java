import java.util.Scanner;
class Convert
{
    public static int con(int num) 
    {
        int  count=0,a=0;
        String x="";
        while(num>0)
        {
            a=num%2;
            if(a==1)
            {
                count++;
            }
            x=x+""+a;
            num=num/2;

        }
        System.out.println("Binary number:"+x);
        System.out.println("No. of 1s:"+count);
        return num;


    }
      public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num,y;
        System.out.println("enter a number");
        num=in.nextInt();
        y=con(num);
        //System.out.println(y);
         //System.out.println("Binary number:"+x);
        //System.out.println("No. of 1s:"+count);
    }       
} 
