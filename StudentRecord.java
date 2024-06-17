import java.util.HashMap;
import java.util.Map;
public class StudentRecord{
private int studentId;
private String name;
private int[] marks;
public StudentRecord(int studentId,String name,int[] marks){
this.studentId=studentId;
this.name=name;
this.marks=marks;
}
public static double calculateMode(int[] marks){
Map<Integer,Integer>countMap=new HashMap<>();
int maxCount=0;
int mode=-1;
for(int mark:marks){
int count=countMap.getOrDefault(mark,0)+1;
countMap.put(mark,count);
if(count>maxCount){
maxCount=count;
mode=mark;
}
}
return mode;
}
public static int findMax(int[] marks){
int max=marks[0];
for(int mark:marks){
if(mark>max){
max=mark;
}
}
return max;
}
public static int findMin(int[] marks){
int min=marks[0];
for(int mark:marks){
if(mark<min){
min=mark;
}
}
return min;
}
public static void displayStudentDetails(int studentId,String name,int[] marks){
System.out.println("Student Details");
System.out.println("ID: "+studentId);
System.out.println("Name: "+name);
System.out.print("Marks: [");
for(int i=0;i<marks.length;i++){
System.out.print(marks[i]);
if(i<marks.length-1){
System.out.print(", ");
}
}
System.out.println("]");
double mode=calculateMode(marks);
int max=findMax(marks);
int min=findMin(marks);
System.out.println("Mode of marks: "+mode);
System.out.println("Maximum Mark: "+max);
System.out.println("Minimum Mark: "+min);
System.out.println();
}
public static void main(String[] args){
	int[] marks1={80,85,90,80,80};
	int[] marks2={70,65,80,75,70};
	displayStudentDetails(101,"Alice",marks1);
	displayStudentDetails(102,"B0b",marks2);
}
}