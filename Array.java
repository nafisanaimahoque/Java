public class Array{
public static void main(String[] args){
int[]arr=new int[5];
try{
int element=arr[6];
System.out.println("Element at index 6"+element);
}
catch(ArrayIndexOutOfBoundsException e){
System.err.println("Error "+e.getMessage());
}
finally{
System.out.println("program continues executing...");
}
}
}