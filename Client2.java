import java.net.*; 
import java.io.*;
public class Client2 {
public static void main(String args[]) throws IOException {
Socket s1 = new Socket("localhost",4999); 
OutputStream s1out = s1.getOutputStream();
DataOutputStream dos = new DataOutputStream(s1out);
dos.writeUTF("Hello Server1 from client Message #1 ");
InputStream s1In = s1.getInputStream();
DataInputStream dis = new DataInputStream(s1In);
String st = new String (dis.readUTF());
System.out.println(st);  
OutputStream s1out2 = s1.getOutputStream();
DataOutputStream dos2 = new DataOutputStream (s1out2);
dos.writeUTF("Hello Server1 from client Message #2 ");
InputStream s1In2 = s1.getInputStream();
DataInputStream dis2 = new DataInputStream(s1In2);
String st2 = new String (dis2.readUTF());
System.out.println(st2);  
}
}
