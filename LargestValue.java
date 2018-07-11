import java.util.*;
class LargestValue
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b[]=new int[a];
		int c=0;
		for(int i=0;i<a;i++)
		{
		  b[i]=s.nextInt();
		  if(b[i]==0)
		   c++;
		}
		Arrays.sort(b);
		for(int i=a-1;i>=0;i--)
		{
		 if(c==a)
		 {
		  System.out.print("0");
		  break;
		 }
		 else
		  System.out.print(b[i]);
		}
	}
}
