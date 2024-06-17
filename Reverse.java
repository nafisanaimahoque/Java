import java.util.Scanner;
public class Reverse{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.print("enter  a sentence: ");
String sentence=s.nextLine();
String reverse=reverseSentence(sentence);
System.out.println("reversed sentence: "+reverse);
s.close();
}
public static String reverseSentence(String sentence){
	String[] words=sentence.split(" ");
	StringBuilder reversed=new StringBuilder();
	for(int i=words.length-1;i>=0;i--){
		reversed.append(words[i]).append(" ");
	}
	return reversed.toString().trim();
}
}