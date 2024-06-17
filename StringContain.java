import java.util.Objects;
import java.util.Scanner;
public class StringContain{
public static void main(String[] args){
System.out.println("Input first string");
Scanner s=new Scanner(System.in);
String a=s.nextLine();
System.out.println("Input second string");
String b=s.nextLine();
String[]a1=a.split(" ");
String[]b1=b.split(" ");
int l=0;
for(int i=0;i<a1.length;i++){
for(int j=0;j<b1.length;j++){
if(Objects.equals(a1[i],b1[j])){
l++;
}
}
}
if(l!=0){
System.out.println("If the second string contains the first one?Yes");
}
else
System.out.println("If the second string contains the first one?No");
}
}