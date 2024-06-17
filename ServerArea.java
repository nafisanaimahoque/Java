import java.net.*;
import java.io.*;
public class ServerArea{
public static void main(String args[])throws IOException{
ServerSocket ss=new ServerSocket(4999);
Socket s1=ss.accept();
DataInputStream s1In=new DataInputStream(s1.getInputStream());
DataOutputStream out=new DataOutputStream(s1.getOutputStream());
while(true){
double radius=s1In.readDouble();
System.out.println("Radius receive from client is "+radius);
double area=radius*radius*Math.PI;
System.out.println("Area send to client is"+area);
out.writeDouble(area);
}
}
}