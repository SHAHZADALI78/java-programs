import java.util.Scanner;
class Calculator{
public static void main (String[]args){
System.out.println("1.ADDITION, 2.SUBTRACTION, 3.MULTIPLICATION, 4.DIVISION");
System.out.println("Enter the Num1 and Num2:");
Scanner sc = new Scanner(System.in);
int num1 = sc.nextInt();
int num2 = sc.nextInt();
System.out.println("Kindly Enter Your Choice");
String choice = sc.next();
if(choice.equals("1")){
System.out.println("ADDITION  " + (num1+num2) );}
else if(choice.equals("2")){
System.out.println("SUBTRACTION  " + (num1-num2));}
else if (choice.equals("3")){
System.out.println("MULTIPLICATION  " +(num1*num2));}
else{
System.out.println("DIVISION  "+(num1/num2));}
}
}