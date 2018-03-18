import java.util.*;
class Vowel
{
public static void main(String args[])
{
char a[]={'a','e','i','o','u'};
Scanner s=new Scanner(System.in);
char b=s.next().charAt(0);
for(int i=0;i<a.length;i++)
{
if(b==a[i])
System.out.println("Vowel");
}
System.out.println("Consonant");
}
}
