import java.util.*;
class Vowel
{
public static void main(String args[])
{
char a[5]={'a','e','i','o','u'};
Scanner s=new Scanner(System.in);
char b=s.nextchar();
for(int i=0;i<5;i++)
{
if(b==a[i])
System.out.println("Vowel");
}
System.out.println("Consonant");
}
}
