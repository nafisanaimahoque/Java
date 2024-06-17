import java.net.*; 
import java.io.*;
public class Server2 {
public static void main(String args[]) throws IOException {
ServerSocket ss = new ServerSocket(4999);
Socket s1=ss.accept(); 
InputStream s1In = s1.getInputStream();
DataInputStream dis = new DataInputStream(s1In);
String st = new String (dis.readUTF());
System.out.println(st); 
OutputStream s1out = s1.getOutputStream();
DataOutputStream dos =  new DataOutputStream (s1out);
dos.writeUTF("Hello Client1 from server First Message");
InputStream s1In2 = s1.getInputStream();
DataInputStream dis2 = new DataInputStream(s1In2);
String st2 = new String (dis2.readUTF());
System.out.println(st2); 
OutputStream s1out2 = s1.getOutputStream();
DataOutputStream dos2 =  new DataOutputStream(s1out2);
dos2.writeUTF("Hello Client1 from server Second Message");
}
}
