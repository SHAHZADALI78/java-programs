import java.util.Scanner;
class DemoSquare{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter A number: ");
int num = sc.nextInt();
//if(num>0){
int square = (num)*(num);
System.out.print("Square Root Of " + num +" Is:  " + square);
}
}
