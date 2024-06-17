import java.util.Scanner;
class Negative extends Exception{
public Negative(String message){
super(message);
}
}
public class ExceptionHandling{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
try{
while(true){
System.out.print("Enter q to quit");
String i=s.nextLine();
if("q".equalsIgnoreCase(i)){
break;
}
int n=Integer.parseInt(i);
if(n<0){
throw new Negative("Negative number encountered "+n);
}
System.out.println("you entered "+n);
}
}
catch(NumberFormatException e){
System.err.println("Error: invalid input");
}
catch(Negative e){
System.err.println("Error "+e.getMessage());
}
finally{
s.close();
}
}
}