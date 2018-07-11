import java.util.*;
class IndexValue
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
		  if(b[i]==i)
		  {
		   System.out.print(b[i]+" ");
		   c++;	
		  }
		}
		if(c==0)
		 System.out.print("-1");
	}
}
