import java.net.*;
import java.io.*;
import java.util.Scanner;
public class ClientArea{
public static void main(String args[])throws IOException{
Socket cs=new Socket("localhost",4999);
DataInputStream s1In=new DataInputStream(cs.getInputStream());
DataOutputStream out=new DataOutputStream(cs.getOutputStream());
while(true){
Scanner i=new Scanner(System.in);
System.out.print("enter a number for radius");
double radius=i.nextDouble();
out.writeDouble(radius);
double area=s1In.readDouble();
System.out.println("Area received from the server is"+area+" ");
}
}
}