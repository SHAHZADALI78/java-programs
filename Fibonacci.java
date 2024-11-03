import java.util.Scanner;
class Fibonacci {
public static void main(String[] args) {
System.out.print("Enter the number for Fibonacci Series: ");
Scanner sc = new Scanner(System.in);
int number = sc.nextInt();
int num1= sc.nextInt();
System.out.print("Enter The num1: ");
int num2 =sc.nextInt();
System.out.print("Enter The num2:  ");
int nextnum; 
for(int i = 1; i<=number; i++){
System.out.println(num1);
nextnum = num1 + num2;
num1 = num2;
num2 = nextnum;
}
}
}
