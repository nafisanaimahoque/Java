import java.util.Scanner;
public class Arithmetic{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.print("Enter the first integer");
int n1=s.nextInt();
System.out.print("Enter the second integer");
int n2=s.nextInt();
try{
int sum=n1+n2;
System.out.println("Sum"+sum);
int sub=n1-n2;
System.out.println("Subtraction"+sub);
int mul=n1*n2;
System.out.println("Multiplication"+mul);
if(n2==0){
throw new ArithmeticException("division by zero is not possible");
}
double division=(double)n1/n2;
System.out.println("Division"+division);
}
catch(ArithmeticException e){
System.err.println("Error "+e.getMessage());
}
catch(Exception e){
System.err.println("An error occured"+e.getMessage());
}
finally{
s.close();
}
}
}