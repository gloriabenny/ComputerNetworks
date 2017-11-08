import java.io.*;
import java.net.*;
import java.util.*;
public class MyClient {
public static void main(String[] args) {
try{
  int opt = 0;
  String str = "";
Socket s=new Socket("localhost",6666);
Scanner scan = new Scanner(System.in);
DataOutputStream dout=new DataOutputStream(s.getOutputStream());
while(opt !=2)
{
  System.out.print("Enter your option.\n1. Send message\n2. Exit\nYour option: ");
  opt = scan.nextInt();
  if(opt==1)
  {
    System.out.print("Enter your message : ");
    str = scan.next();
    dout.writeUTF(str.toString());
  }
  else if(opt==2)
  {
    str = "exit";
    dout.writeUTF(str);
  }
dout.flush();
}
dout.close();
s.close();
}catch(Exception e){System.out.println(e);}
}
}
