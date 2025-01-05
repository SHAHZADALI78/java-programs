class BankAccount{
public void Deposit(){
System.out.println("Account Has Been Opened You Deposit Amount There");
}

public void withdraw(int salary){
System.out.println("Withdraw Amount is: ");
return 50000;
}
}

class SavingsAccount extends BankAccount{
public void withdraw(){
double balance = 10000;
if (balance > 100){
System.out.println("You Can Not Make Withdraw More ");
}
}
}

class Bank{
public static void main(String [] args){
BankAccount B = new BankAccount();
B.Deposit();
SavingsAccount S = new SavingsAccount();
S.withdraw();
}
}





