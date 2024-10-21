import java.util.Scanner;
class BmiCalculator{
public static void main(String[]args){
System.out.println("enter the values of Body, Mass aand Calculator");
Scanner sc = new Scanner(System.in);
int Body = newInt();
int Mass = newInt();
if(Body==5feet && Mass==60kg){
System.out.println("The Person is Normal");}
else if(Body==5feet && Mass==80kg){
System.out.println("The Person is OverWeight");}
else{
System.out.println("The Person is UnderWeight");}
}
}