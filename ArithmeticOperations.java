import java.util.Scanner;
public class ArithmeticOperations{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int n1,n2;
String operator;
try{
System.out.print("enter the first integer: ");
n1=Integer.parseInt(s.nextLine());
System.out.print("enter the second integer: ");
n2=Integer.parseInt(s.nextLine());
System.out.print("enter the operator(+,-,*,/): ");
operator=s.nextLine();
int result=performOperation(n1,n2,operator);
System.out.println("Result: "+n1+" "+operator+" "+n2+" "+"="+result);
}catch(NumberFormatException e){
System.err.println("Error: invalid input for integers");
}catch(IllegalArgumentException e){
System.err.println("invalid operator");
}catch(ArithmeticException e){
	System.err.println("division by zero is not allowed");
}finally{
	s.close();
}
}
public static int performOperation(int n1,int n2,String operator){
	int result=0;
	switch(operator){
		case "+":
		result=n1+n2;
		break;
		case "-":
		result=n1-n2;
		break;
		case "*":
		result=n1*n2;
		break;
		case "/":
		if(n2==0){
			throw new ArithmeticException("division by zero is not allowed");
		}
		result=n1/n2;
		break;
		default:
		throw new IllegalArgumentException("invalid operator");
	}
	return result;
}
}
