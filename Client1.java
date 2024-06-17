import java.net.*;
import java.io.*;
public class Client1 {
public static void main(String args[]) throws IOException {
Socket s2 = new Socket("localhost",4999);
OutputStream s1out = s2.getOutputStream();
DataOutputStream dos = new DataOutputStream (s1out);
dos.writeUTF("Hello Server1, this from client Message #1 ");
InputStream s1In = s2.getInputStream();
DataInputStream dis = new DataInputStream(s1In);
String st = new String (dis.readUTF());
System.out.println(st);
dos.close();
s1In.close();
s1out.close();
s2.close();
}
}
