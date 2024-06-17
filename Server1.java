import java.net.*;
import java.io.*;
public class Server1{
public static void main(String args[])throws IOException{
ServerSocket ss=new ServerSocket(4999);
Socket s1=ss.accept();
InputStream s1In=s1.getInputStream();
DataInputStream dis=new DataInputStream(s1In);
String st=new String(dis.readUTF());
System.out.println(st);
OutputStream s1out=s1.getOutputStream();
DataOutputStream dos=new DataOutputStream(s1out);
dos.writeUTF("Hello client 1 from server first message ");
dos.close();
s1In.close();
s1out.close();
s1.close();
}
}