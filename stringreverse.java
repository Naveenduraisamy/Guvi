import java.io.*;
class stringreverse{
  public static void main(String args[])throws IOException
  {
    DataInputStream d=new DataInputStream(System.in);
    String a=d.readLine();
    StringBuilder str=new StringBuilder();
    str.append(a);
    System.out.println(str.reverse());
  }
}
