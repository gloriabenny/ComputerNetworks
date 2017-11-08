import java.io.*;
import java.net.*;
import java.util.*;
public class sends {
public static void main(String[] args) throws Exception{
sends p= new sends();
p.ex();
 }
public static void ex throws Exception{
  int opt = 0;

  
Socket s=new Socket("localhost",6666);
Scanner scan = new Scanner(System.in);
DataOutputStream dout=new DataOutputStream(s.getOutputStream());

  System.out.print("Enter no. of framws ");
  opt = scan.nextInt();
  for(int i=0;i<opt;i++)
   {    
    dout.writeUTF(String.valueOf(i));
    System.out.println("frame "+i+" sent");
    Thread.sleep(4000);
    System.out.println("ack "+i+" received");
    Thread.sleep(4000);
  }
  


}
}