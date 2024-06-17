import java.util.Scanner;
public class Multiply{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.print("enter the first integer: ");
int num1=s.nextInt();
System.out.print("enter second integer: ");
int num2=s.nextInt();
int product=multiply(num1,num2);
System.out.println("Product: " +product);
s.close();
}
public static int multiply(int num1,int num2){
int product =0;
boolean isNegative=false;
if(num1<0 && num2>=0 || num1>=0 && num2<0){
	isNegative=true;
}
num1=Math.abs(num1);
num2=Math.abs(num2);
for(int i=0;i<num2;i++){
	product+=num1;
}
return isNegative?-product:product;
}
}
