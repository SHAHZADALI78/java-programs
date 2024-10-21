import java.util.Scanner;
class DemoLeapYear{
public static void main(String[]args){
System.out.println("Enter the Year: ");
Scanner sc = new Scanner(System.in);
int Year = sc.nextInt();
if(Year % 4 == 0){
System.out.println("The Year "+Year+" Is LeapYear");}
else{
System.out.println("The Year "+Year+" Is Not a LeapYear");}
}
}

