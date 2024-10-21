import java.util.Scanner;
class DemoRange{
public static void main(String[]args){
System.out.println("Enter the number of your choice from given Range:");
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
if(num>=10 && num<=30){
System.out.println("you enterd number lies in starting part of range");}
else if(num>=31 && num<=50){
System.out.println("you enterd number lies in ending part of range");}
else{
System.out.println("your enterd number is out of range");}
}
}