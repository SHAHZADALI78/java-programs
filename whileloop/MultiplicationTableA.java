import java.util.Scanner;
class MultiplicationTableA{
public static void main(String [] args){
System.out.println("Enter A Number For Multiplication Table:");
Scanner sc = new Scanner(System.in);
int number = sc.nextInt();
 System.out.println("Multiplication Table for " + number );
int num=0;
while(num<=9){
num++;
System.out.println(number + "*" + num + "=" + (number*num));
}
}
}