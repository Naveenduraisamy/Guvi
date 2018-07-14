/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b[]=new int[a];
		for(int i=0;i<a;i++)
		 b[i]=s.nextInt();
		for(int i=0;i<a;i++)
		{
			for(int j=i+1;j<a;j++)
			{
				sum=a[i]+a[j];
				if(sum==a[j+1])
				 System.out.println(a[i]+" "+a[j]+" "+a[j+1]);
			}
		}
	}
}
