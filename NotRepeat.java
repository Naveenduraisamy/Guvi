import java.util.*;
class NotRepeat
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int c=0;
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=0;i<a;i++)
		{
			al.add(s.nextInt());
		}
		Set<Integer> st=new LinkedHashSet<Integer>(al);
		for(int b:st)
		{
			c=Collections.frequency(al,b);
			if(c==1)
			 System.out.print(b+" ");
		}
	}
}
