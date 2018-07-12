/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class PossibleAlphabet
{
  public static void main (String[] args) throws java.lang.Exception
  {
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    String b=String.valueOf(a);
    int d=1;
    for(int i=0;i<b.length()-1;i++)
    {
      if((Character.getNumericValue(b.charAt(i))<3) && (Character.getNumericValue(b.charAt(i+1))<7)))
       d++;
    }
    for(int i=0;i<b.length()-1;i++)
    {
    	if(i%2==0)
    	{
    	 if((Character.getNumericValue(b.charAt(i)))<3 && (Character.getNumericValue(b.charAt(i+1)))<7))
    	   d++;
    	}
    }
    System.out.println(d);
 }
}
