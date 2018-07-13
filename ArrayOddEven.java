import java.util.*;
class ArrayOddEven
{
  public static void main (String[] args) throws java.lang.Exception
  {
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    int b[]=new int[a];
    for(int i=0;i<a;i++)
    {
      b[i]=s.nextInt();
      if(i%2==0 && b[i]%2!=0)
       System.out.print(b[i]+" ");
      if(i%2!=0 && b[i]%2==0)
       System.out.print(b[i]+" ");
    }
  }
}
