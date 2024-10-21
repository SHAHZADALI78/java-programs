import java.util.Scanner;
class DemoPeriodicTable{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Atomic Number of Element:");
int element = sc.nextInt();
switch(element){
case 1:
System.out.println("The Element is: Hydrogen");
break;
case 3:
System.out.println("The Element is: Lithium");
break; 
case 5:
System.out.println("The Element is: Boron");
break; 
case 6:
System.out.println("The Element is: Carbon");
break; 
case 7:
System.out.println("The Element is: Nitrogen ");
break; 
case 8:
System.out.println("The Element is: Oxygen");
break;
case 11:
System.out.println("The Element is: Sodium");
break;
default:
System.out.println("Element Number Is Incorrect: ");
}
}
}

  