public class StudentRecordManager{
public static double calculateAverage(int[] marks){
int sum=0;
for(int mark:marks){
sum+=mark;
}
return(double)sum/marks.length;
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
public static void displayStudentDetails(int studentID,String name,int[] marks){
	System.out.println("student id "+studentID);
	System.out.println("Name "+name);
	System.out.println("mark "+java.util.Arrays.toString(marks));
	System.out.println("average mark "+calculateAverage(marks));
	System.out.println("maximum mark "+findMax(marks));
	System.out.println("minimum mark: "+findMin(marks));
}
public static void main(String[] args){
	int[] marks1 = {80, 85, 90, 75, 95};
	        int[] marks2 = {70, 65, 80, 75, 60};
	                StudentRecordManager.displayStudentDetails(101, "Alice", marks1);
	                StudentRecordManager.displayStudentDetails(102, "Bob", marks2);
	    }
	}
