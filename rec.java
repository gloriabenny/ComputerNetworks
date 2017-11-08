import java.io.*;
import java.net.*;
public class rec {
public static void main(String[] args)
	{
		rec r = new rec();
		r.run();
	}
public static void run throws Exception{
  String str = "";
ServerSocket ss=new ServerSocket(6666);
Socket s=ss.accept();//establishes connection
DataInputStream dis=new DataInputStream(s.getInputStream());
while(str != "exit")
{ str=(String)dis.readUTF();
System.out.println("Frame received= "+str);
thread.sleep(4000);
}
ss.close();
System.out.println("Recieved exit command. Exiting...");

}
}
