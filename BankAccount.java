public class BankAccount{
private String accountNumber;
private String accountHolderName;
private double balance;
public BankAccount(String accountNumber,String accountHolderName,double balance){
this.accountNumber=accountNumber;
this.accountHolderName=accountHolderName;
this.balance=balance;
}
public void deposit(double amount){
if(amount>0){
balance+=amount;
}
else{
System.out.println("error");
}
}
public void withdraw(double amount){
if(amount>0 && amount<=balance){
balance-=amount;
}
else{
System.out.println("error");
}
}
public void displayAccountDetails(){
System.out.println("Account Number: "+accountNumber);
System.out.println("Account Holder: "+accountHolderName);
System.out.println("Balance: "+balance);
System.out.println(" ");
}
public static void main(String[] args){
BankAccount account1=new BankAccount("12345","John Doe",1000.0);
BankAccount account2=new BankAccount("67890","Jane Smith",500.0);
account1.deposit(500.0);
account2.withdraw(200.0);
account1.displayAccountDetails();
account2.displayAccountDetails();
}
}