import java.util.*;
public class FrequencyMaxLength{
public static void main (String []args){
Scanner s=new Scanner(System.in);
System.out.print("enter a text");
String text=s.nextLine();
String frequency=mostFrequentWord(text);
String max=maxLengthWord(text);
System.out.println("most frequently used word: "+frequency);
System.out.println("word with maximum length: "+max);
s.close();
}
public static String mostFrequentWord(String text){
String[] words=text.split("\\s+");
Map<String,Integer>wordcount=new HashMap<>();
for(String word:words){
word=word.toLowerCase();
wordcount.put(word,wordcount.getOrDefault(word,0)+1);
}
int maxcount=0;
String frequency=" ";
for (Map.Entry<String,Integer>entry:wordcount.entrySet()){
if (entry.getValue()>maxcount){
maxcount=entry.getValue();
frequency=entry.getKey();
}
}return frequency;
}
public static String maxLengthWord(String text){
String[] words=text.split("\\s+");
String max=" ";
for(String word:words){
if(word.length()>max.length()){
max=word;
}
}
return max;
}
}