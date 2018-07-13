import java.util.*;
class PossibleAlphabet
{
   public static void main (String[] args)
  {
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    String b=String.valueOf(a);
    int d=1,e=0,f=0;
    String x="",y="";
    for(int i=0;i<b.length()-1;i++)
    {
      e=Character.getNumericValue(b.charAt(i));
      f=Character.getNumericValue(b.charAt(i+1));
      if(e<3 && f<7 && e!=0)
       d++;
    }
    for(int i=0;i<b.length()-1;i++)
    {
    	if(i%4==0 && b.length()>3)
    	{
             x=x+Character.getNumericValue(b.charAt(i))+Character.getNumericValue(b.charAt(i+1));
             y=y+Character.getNumericValue(b.charAt(i+2))+Character.getNumericValue(b.charAt(i+3));
             e=Integer.parseInt(x);
             f=Integer.parseInt(y);
             if(x.charAt(0)=='0' || x.charAt(1)=='0')
              e=0;
    	 if(e<27 && f<27 && e!=0)
    	   d++;
    	}
    	x="";y="";
    }
    System.out.println(d);
  }
}
