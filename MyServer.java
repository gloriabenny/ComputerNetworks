import java.io.*;
import java.net.*;
public class MyServer {
public static void main(String[] args){
try{
  String str = "";
ServerSocket ss=new ServerSocket(6666);
Socket s=ss.accept();//establishes connection
DataInputStream dis=new DataInputStream(s.getInputStream());
while(str != "exit")
{ str=(String)dis.readUTF();
System.out.println("Message Recieved= "+str);
}
ss.close();
System.out.println("Recieved exit command. Exiting...");

}catch(Exception e){}
}
}
