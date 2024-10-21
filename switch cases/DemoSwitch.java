import java.util.Scanner;
class DemoSwitch{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Paper number:");
int paper = sc.nextInt();
switch(paper){
case 1:
System.out.println("Today is your English Paper:");
break;
case 2:
System.out.println("Today is your Maths Paper:");
break;
case 3:
System.out.println("Today is your Biology Paper:");
break;
case 4:
System.out.println("Today is your ComputerScience Paper:");
break;
default:
System.out.println("You Have Put Wrong Number:");
}
}
}