import java.io.*;
class stringreverse{
  public static void main(String args[])
  {
    DataInputStream d=new DataInputStream(System.in);
    String a=Integer.parseInt(d.readLine());
    System.out.println(a.reverse());
  }
}
